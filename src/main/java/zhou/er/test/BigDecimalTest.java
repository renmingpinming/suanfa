package zhou.er.test;

import zhou.er.model.PoBudgetDo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Author:XiaoLang
 * @Date:2019-09-25 15:51
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal(10).setScale(2,BigDecimal.ROUND_HALF_UP);
        List<PoBudgetDo> budgetDos = new ArrayList<>();
        PoBudgetDo d1 = new PoBudgetDo();
        PoBudgetDo d2 = new PoBudgetDo();
        PoBudgetDo d3 = new PoBudgetDo();
        PoBudgetDo d4 = new PoBudgetDo();
        d1.setThreshold(new BigDecimal(5));
        d2.setThreshold(new BigDecimal(3));
        d3.setThreshold(new BigDecimal(7));
        d4.setThreshold(new BigDecimal(9));
        budgetDos.add(d1);
        budgetDos.add(d2);
        budgetDos.add(d3);
        budgetDos.add(d4);
        Optional<BigDecimal> max = budgetDos.stream().map(a -> a.getThreshold()).max(Comparator.naturalOrder());
        BigDecimal max2 = budgetDos.stream().map(a -> a.getThreshold()).max(Comparator.naturalOrder()).orElse(BigDecimal.ZERO);
        Optional<PoBudgetDo> max1 = budgetDos.stream().max((u1, u2) -> u1.getThreshold().compareTo(u2.getThreshold()));
        List<PoBudgetDo> budgetDos2 = new ArrayList<>();
        List<PoBudgetDo> budgetDos1 = budgetDos2.stream().filter(s->s.getThreshold().compareTo(new BigDecimal(5)) == 0).collect(Collectors.toList());
    }
}
