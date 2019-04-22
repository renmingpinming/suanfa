package zhou.yi.leetCode.easy3;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/22 10:13
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 */
public class _110 {
    public boolean isBalanced(_100.TreeNode root) {
        if(root==null) return true;
        int l=depth(root.left);
        int r=depth(root.right);
        return ((int)Math.abs(l-r)<2)&&isBalanced(root.left) && isBalanced(root.right);
    }
    static int depth(_100.TreeNode n){
        if(n==null) return 0;
        return Math.max(depth(n.left),depth(n.right))+1;
    }
}
