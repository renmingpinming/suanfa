package zhou.yi.leetCode.easy3;

import zhou.yi.leetCode.model.TreeNode;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/22 9:19
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */
public class _108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        return helper(nums,0,nums.length - 1);
    }

    public TreeNode helper(int[] nums,int left,int right){
        if(left > right){
            return null;
        }
        int mid = (left + right) >>> 1;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,left,mid - 1);
        node.right = helper(nums,mid + 1,right);
        return node;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-10,-3,0,5,9};
        _108 test2 = new _108();
        TreeNode node = test2.sortedArrayToBST(arr);
//        while (node!=null){
            System.out.println(node.val);
//        }
    }
}
