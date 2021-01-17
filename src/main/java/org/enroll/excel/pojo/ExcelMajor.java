package org.enroll.excel.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.HeadFontStyle;
import com.alibaba.excel.annotation.write.style.HeadStyle;
import com.sun.istack.NotNull;
import lombok.*;
import org.apache.ibatis.type.Alias;
import org.apache.poi.ss.usermodel.FillPatternType;

@Data
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ExcelMajor {

    @NotNull
    @ExcelProperty("专业代号")
    private String majorId;

    @NotNull
    @ExcelProperty("专业代码")
    private String majorCode;

    @NotNull
    private int departmentId;

    @NotNull
    @ExcelProperty("学院")
    private String departmentName;

    @NotNull
    @ExcelProperty("专业名称")
    private String majorName;

    @NotNull
    @ExcelProperty("备注")
    private String comment;

    @NotNull
    @ExcelProperty("学制年限")
    private int period;

    @NotNull
    @ExcelProperty("招生计划数")
    private int planStudentCount;

    private int realisticStudentCount;
}
