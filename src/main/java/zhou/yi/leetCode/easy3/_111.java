package zhou.yi.leetCode.easy3;

import zhou.yi.leetCode.model.TreeNode;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/22 10:57
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最小深度  2.
 */
public class _111 {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (l != 0 && r != 0) return 1 + Math.min(l, r);
        return l + r + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        _111 test = new _111();
        System.out.println(test.minDepth(root));
    }
}
