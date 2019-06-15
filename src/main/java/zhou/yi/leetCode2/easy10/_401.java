package zhou.yi.leetCode2.easy10;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/6/15 11:06
 * 二进制手表顶部有 4 个 LED 代表小时（0-11），底部的 6 个 LED 代表分钟（0-59）。
 *
 * 每个 LED 代表一个 0 或 1，最低位在右侧。
 * 例如，上面的二进制手表读取 “3:25”。
 *
 * 给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。
 *
 * 案例:
 *
 * 输入: n = 1
 * 返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-watch
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _401 {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new LinkedList<>();
        //直接遍历  0:00 -> 12:00   每个时间有多少1
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == num)
                    res.add(i + ":" + (j < 10 ? "0" + j : j));
            }
        }
        return res;
    }

    /**
     * 计算二进制中1的个数
     * @param n
     * @return
     */
    int count1(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        _401 test = new _401();
        System.out.println(test.readBinaryWatch(2));
    }
}
