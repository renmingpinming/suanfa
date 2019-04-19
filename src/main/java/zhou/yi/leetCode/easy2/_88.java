package zhou.yi.leetCode.easy2;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/19 9:32
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 */
public class _88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int sumIndex = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0){
            if(nums1[m] > nums2[n]){
                nums1[sumIndex] = nums1[m];
                m--;
            }else {
                nums1[sumIndex] = nums2[n];
                n--;
            }
            sumIndex--;
        }
        while (n >= 0){
            nums1[sumIndex] = nums2[n];
            n--;
            sumIndex--;
        }
        System.out.println(nums1);
    }

    public static void main(String[] args) {
        _88 test = new _88();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        test.merge(nums1,m,nums2,n);
    }
}
