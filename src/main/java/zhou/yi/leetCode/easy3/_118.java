package zhou.yi.leetCode.easy3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/22 15:23
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class _118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return null;
        }
        List<List<Integer>> rst = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    sub.add(1);
                } else {
                    sub.add(rst.get(i - 1).get(j - 1) + rst.get(i - 1).get(j));
                }
            }
            rst.add(sub);
        }
        return rst;
    }

    public static void main(String[] args) {
        _118 test = new _118();
        System.out.println(test.generate(5));
    }
}
