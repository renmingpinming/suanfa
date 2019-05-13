package zhou.yi.leetCode.easy3;

import zhou.yi.leetCode.model.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/19 10:39
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */
public class _107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> rst = new LinkedList<>();
        if(root == null){
            return rst;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> subList;
        while (!queue.isEmpty()){
            int size = queue.size();
            subList = new LinkedList<>();
            for(int i = 0;i < size;i++){
                TreeNode node = queue.poll();
                subList.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            rst.add(0,subList);
        }
        return rst;
    }
}
