package org.cmd;

import com.alibaba.excel.EasyExcel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.cli.*;
import org.cmd.listener.ReadAndWriteExecuteListener;
import org.cmd.model.ReadSt;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Wu.Chunyang
 */
@Slf4j
public class ExcelCmdMain {
    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("f", true, "Excel文件路径！");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            if (cmd.hasOption("f")) {
                String filePath = cmd.getOptionValue("f");
                EasyExcel.read(filePath, ReadSt.class, new ReadAndWriteExecuteListener()).sheet().doRead();
            } else {
                log.warn("unknown cmd!");
            }
        } catch (ParseException e) {
            System.out.println("error:" + e);
        }

    }
}
