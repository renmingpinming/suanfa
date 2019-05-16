package zhou.yi.leetCode2.easy8;

import zhou.yi.leetCode.model.TreeNode;

import java.util.*;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/15 16:51
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */
public class _257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> rst = new ArrayList<>();
        if(root == null){
            return rst;
        }
        //栈
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        Stack<Integer> levels = new Stack<Integer>();
        levels.push(0);
        stack.push(root);
        while (!stack.isEmpty()){
            int lv = levels.pop();
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.left == null && node.right == null) {
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < list.size() - 1; i++) {
                    sb.append(list.get(i) + "->");
                }
                sb.append(list.get(list.size() - 1));
                rst.add(sb.toString());
                while (!levels.isEmpty() && list.size() > levels.peek()) {
                    list.remove(list.size() - 1);
                }
            }
            if(node.left != null){
                stack.push(node.left);
                levels.push(lv + 1);
            }
            if(node.right != null){
                stack.push(node.right);
                levels.push(lv + 1);
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        _257 test = new _257();
        int[] nums = new int[]{1,2,3,4,5};
        List<TreeNode> root = TreeNode.createBinaryTree(nums);
        System.out.println(test.binaryTreePaths(root.get(0)));
    }
}
