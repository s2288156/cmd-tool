package org.cmd.model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author Wu.Chunyang
 */
@Data
public class WriteSt {
    @ExcelProperty("机台编号")
    private String sn;

    @ExcelProperty("规格")
    private String spec1;
    @ExcelProperty("备注")
    private String remark1;

    @ExcelProperty("规格")
    private String spec2;
    @ExcelProperty("备注")
    private String remark2;

    @ExcelProperty("规格")
    private String spec3;
    @ExcelProperty("备注")
    private String remark3;

    @ExcelProperty("规格")
    private String spec4;
    @ExcelProperty("备注")
    private String remark4;

    @ExcelProperty("规格")
    private String spec5;
    @ExcelProperty("备注")
    private String remark5;

    @ExcelProperty("规格")
    private String spec6;
    @ExcelProperty("备注")
    private String remark6;

    @ExcelProperty("规格")
    private String spec7;
    @ExcelProperty("备注")
    private String remark7;

    @ExcelProperty("规格")
    private String spec8;
    @ExcelProperty("备注")
    private String remark8;

    @ExcelProperty("规格")
    private String spec9;
    @ExcelProperty("备注")
    private String remark9;
}
