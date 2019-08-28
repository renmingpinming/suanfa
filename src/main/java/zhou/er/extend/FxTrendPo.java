package zhou.er.extend;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author:XiaoLang
 * @Date:2019-08-27 16:50
 */
@Data
public class FxTrendPo {
    private String name;
    private String[] columns;
    private Trend trend;
    private List<Trend> trends;
}
