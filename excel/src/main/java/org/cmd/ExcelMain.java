package org.cmd;

import org.apache.commons.cli.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Wu.Chunyang
 */
public class ExcelMain {
    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("t", false, "show data time!");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            if (cmd.hasOption("t")) {
                System.out.println(LocalDateTime.now());
            } else {
                System.out.println(LocalDate.now());
            }
        } catch (ParseException e) {
            System.out.println("error:" + e);
        }

    }
}
