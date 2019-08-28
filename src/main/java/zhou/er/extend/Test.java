package zhou.er.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:XiaoLang
 * @Date:2019-08-27 17:12
 */
public class Test {
    public static void main(String[] args) {
        FxTrendPo fxTrendPo = new FxTrendPo();
        Trend trend = new PriceTrend();
        fxTrendPo.setTrend(trend);
        List<Trend> trends = new ArrayList<>();
        fxTrendPo.setTrends(trends);
    }
}
