package zhou.yi.leetCode.easy3;

import zhou.yi.leetCode.model.TreeNode;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/22 10:13
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 * <p>
 * 示例 1:
 * <p>
 * 给定二叉树 [3,9,20,null,null,15,7]
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回 true 。
 * <p>
 * 示例 2:
 * <p>
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 * <p>
 * 1
 * / \
 * 2   2
 * / \
 * 3   3
 * / \
 * 4   4
 * 返回 false 。
 */
public class _110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int l = depth(root.left);
        int r = depth(root.right);
        return ((int) Math.abs(l - r) < 2) && isBalanced(root.left) && isBalanced(root.right);
    }

    static int depth(TreeNode n) {
        if (n == null) return 0;
        return Math.max(depth(n.left), depth(n.right)) + 1;
    }
}
