package zhou.er.test;

import zhou.er.extend.FxTrendPo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @Author:XiaoLang
 * @Date:2019-09-20 10:32
 */
public class RegexTest1 {
    public static void main(String[] args) {
        List<FxTrendPo> list = new ArrayList<>();
        FxTrendPo p1 = new FxTrendPo();
        p1.setName("HC_HS_a");
        FxTrendPo p2 = new FxTrendPo();
        p2.setName("HC_PNT_a");
        FxTrendPo p3 = new FxTrendPo();
        p3.setName("HC_AUS_b");
        FxTrendPo p4 = new FxTrendPo();
        p4.setName("FC_Tampax_a");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        Pattern pattern = Pattern.compile("^(HC_HS|HC_PNT).*");
        List<FxTrendPo> list2 = list.stream().filter(fxTrendPo -> pattern.matcher(fxTrendPo.getName()).matches()).collect(Collectors.toList());
        Pattern pattern3 = Pattern.compile("^(?!(HC_HS|HC_PNT)).*");
        List<FxTrendPo> list3 = list.stream().filter(fxTrendPo -> pattern3.matcher(fxTrendPo.getName()).matches()).collect(Collectors.toList());
        System.out.println(list2);
    }
}
