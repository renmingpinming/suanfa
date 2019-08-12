package zhou.yi.leetCode2.medium;

/**
 * @Author: XiaoLang
 * @Date: 2019/6/21 14:37
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * 示例:
 * <p>
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 */
public class _11 {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while (end > start) {
            int temp = (end - start) * Math.min(height[start], height[end]);
            if (temp > maxArea) {
                maxArea = temp;
            }
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        _11 test = new _11();
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(test.maxArea(height));
    }
}
