package zhou.yi.leetCode.easy3;

import zhou.yi.leetCode.model.TreeNode;

import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/19 10:33
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 */
public class _104 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String[] args) {
        _100 test = new _100();
        int[] arr = new int[]{1,2,2,3,4,4,3,5};
        List<TreeNode> t1 = TreeNode.createBinaryTree(arr);
        _104 test2 = new _104();
        System.out.println(test2.maxDepth(t1.get(0)));
    }
}
