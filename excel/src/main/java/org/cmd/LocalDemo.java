package org.cmd;

import com.alibaba.excel.EasyExcel;
import lombok.extern.slf4j.Slf4j;
import org.cmd.listener.StDataListener;
import org.cmd.model.ReadSt;

import java.io.File;

/**
 * @author Wu.Chunyang
 */
@Slf4j
public class LocalDemo {

    public static final char SEPARATOR = File.separatorChar;

    public static void main(String[] args) {
        String userhome = System.getProperty("user.home");
        String readFileName = userhome + SEPARATOR + "st.xlsx";
        log.warn("{}", readFileName);
        EasyExcel.read(readFileName, ReadSt.class, new StDataListener()).sheet().doRead();
    }
}
