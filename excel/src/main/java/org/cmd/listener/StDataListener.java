package org.cmd.listener;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.cmd.model.ReadSt;
import org.cmd.model.WriteSt;
import org.cmd.storage.StStorage;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * @author Wu.Chunyang
 */
@Slf4j
public class StDataListener implements ReadListener<ReadSt> {
    private static final char SEPARATOR = File.separatorChar;
    private static final Integer MAX_REMARK_NUM = 9;

    @Override
    public void invoke(ReadSt data, AnalysisContext context) {
        StStorage.add(data);
    }

    @SneakyThrows
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.info("All data analysed!");
        String writeFileName = "C:" + SEPARATOR + "Users" + SEPARATOR + "chunyang.wu" + SEPARATOR + "my.xlsx";
        List<ReadSt> allData = StStorage.queryAll();
        int tupleSize = allData.size() / 3;
        for (int i = 0; i < tupleSize; i++) {
            ReadSt line1 = allData.get(i * 3);
            ReadSt line2 = allData.get(1 + i * 3);
            for (int j = 1; j <= MAX_REMARK_NUM; j++) {
                Field remarkField = ReadSt.class.getDeclaredField("remark" + j);
                Field specField = ReadSt.class.getDeclaredField("spec" + j);
                remarkField.setAccessible(true);
                specField.setAccessible(true);
                String remark = (String) remarkField.get(line2);
                if (StringUtils.isNotBlank(remark)) {
                    // 计算remark值
                    remark = remark.replaceAll("[(][A-Za-z\\d]+[)]", "");
                    int computeValue = Arrays.stream(remark.split("[+]"))
                            .mapToInt(Integer::valueOf)
                            .sum();
                    remarkField.set(line1, String.valueOf(computeValue));
                }
            }
        }
        EasyExcel.write(writeFileName, WriteSt.class).sheet("hello").doWrite(allData);
    }
}
