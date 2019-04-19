package zhou.yi.leetCode.easy3;

import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/19 10:04
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 */
public class _101 {
    public boolean isSymmetric(_100.TreeNode root) {
        if(root == null){
            return Boolean.TRUE;
        }
        return helper(root.left,root.right);
    }

    public boolean helper(_100.TreeNode left,_100.TreeNode right){
        if(left == null && right == null){
            return Boolean.TRUE;
        }
        if (left ==null || right == null || left.val != right.val){
            return Boolean.FALSE;
        }
        return helper(left.left,right.right) && helper(left.right,right.left);
    }

    public static void main(String[] args) {
        _100 test = new _100();
        int[] arr = new int[]{1,2,2,3,4,4,3};
        List<_100.TreeNode> t1 = test.createBinaryTree(arr);
        _101 test2 = new _101();
        System.out.println(test2.isSymmetric(t1.get(0)));
    }
}
