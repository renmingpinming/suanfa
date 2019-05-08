package zhou.yi.poi;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/8 9:33
 */
@Data
public class EasyModel extends BaseRowModel {
    @ExcelProperty(index = 0)
    private Integer x;

    @ExcelProperty(index = 1)
    private Integer y;

    @ExcelProperty(index = 2)
    private Integer z;
}
