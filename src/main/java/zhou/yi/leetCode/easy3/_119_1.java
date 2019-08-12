package zhou.yi.leetCode.easy3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/22 15:51
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1] ->[1,4,6,4,1,1] ->[1,4,6,4,5,1]
 * ->[1,4,6,10,5,1]......
 */
public class _119_1 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; ++i) {
            res.add(1);
            for (int j = i - 1; j > 0; --j) {
                res.set(j, res.get(j - 1) + res.get(j));
            }
        }
        return res;
    }
}
