package zhou.yi.leetCode2.easy8;

import zhou.yi.leetCode.model.TreeNode;

import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/13 17:28
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
public class _226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        _226 test = new _226();
        int[] nums = new int[]{4,2,7,1,3,6,9};
        List<TreeNode> root = TreeNode.createBinaryTree(nums);
        TreeNode x = test.invertTree(root.get(0));
        System.out.println(x);
    }
}
