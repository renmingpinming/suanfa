package zhou.yi.leetCode.easy;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/17 9:39
 * KMP算法
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 */
public class _28 {
    public int strStr(String haystack, String needle) {
        int lenH = haystack.length();
        int lenN = needle.length();
        char[] charH = haystack.toCharArray();
        char[] charN = needle.toCharArray();
        if (lenN == 0) {
            return 0;
        }
        if (lenH == 0 || lenH < lenN) {
            return -1;
        }
        int[] next = getNext(needle);
        int j = 0;
        for (int i = 0; i < lenH; i++) {
            //遇到坏字符，把j退回好前缀中继续符合的
            //ababaeabac
            //ababacd
            //j = 5时碰到不相同，为坏字符，好前缀中也aba符合
            //j = next[j - 1] + 1 = 3;从charH[3]的b字母继续判断
            //b也是坏字符，前缀中a继续符合 j变为1
            //charH[1]的b也是坏字符 ，j变为0
            while (j > 0 && charH[i] != charN[j]) {
                j = next[j - 1] + 1;
            }
            if (charH[i] == charN[j]) {
                j++;
            }
            if (j == lenN) {
                return i - lenN + 1;
            }
        }
        return -1;
    }

    /**
     * 计算失效函数
     *
     * @param needle
     * @return
     */
    public int[] getNext(String needle) {
        char[] chars = needle.toCharArray();
        int len = needle.length();
        int[] next = new int[len];
        int k = -1;
        next[0] = -1;
        for (int i = 1; i < len; i++) {
            //不相等时，上一个相同字母继续比较
            //如 char[] char = ababacd  如k = 2，i = 5,char[2]的a的下一个字母chars[k+1] b 不是chars[i] c,k 赋值为next[k] 0（前一个a）
            //char[0]的a的下一个字母也不是c，k赋值为next[0] = -1
            while (k != -1 && chars[k + 1] != chars[i]) {
                k = next[k];
            }
            if (chars[k + 1] == chars[i]) {
                k++;
            }
            next[i] = k;
        }
        return next;
    }

    public static void main(String[] args) {
        _28 test = new _28();
//        String haystack = "ababaeabac";
        String haystack = "mississippi";
//        String needle = "ababacd";
        String needle = "issip";
        System.out.println(test.strStr(haystack, needle));
    }
}
