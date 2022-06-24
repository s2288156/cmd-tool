package org.cmd.excel;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Wu.Chunyang
 */
@Slf4j
public class LocalTest {
    @Test
    void test_line_size() {
        int a = 6;
        int b = 7;
        int c = 8;
        log.info("6/3 = {}", a / 3);
        log.info("7%3 = {}", b % 3);
        log.info("8%3 = {}", c % 3);
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

    @Test
    void test_reg_exp() {
        String regExp = "[(][A-Za-z\\d]+[)]";
        assertTrue(Pattern.matches(regExp, "(a)"));
        assertTrue(Pattern.matches(regExp, "(ABC)"));
        assertFalse(Pattern.matches(regExp, "(ABC"));
        assertFalse(Pattern.matches(regExp, "(ABC))"));
        assertFalse(Pattern.matches(regExp, "ABC)"));
        String tmp = "100+30(a)+40";
        log.warn("{}",tmp.replaceAll(regExp, ""));
//        log.warn("{}", StringUtils.replaceAll(tmp, regExp, ""));
    }

}
