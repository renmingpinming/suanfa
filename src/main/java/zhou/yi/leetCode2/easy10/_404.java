package zhou.yi.leetCode2.easy10;

import zhou.yi.leetCode.model.TreeNode;

import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/6/15 11:12
 * 计算给定二叉树的所有左叶子之和。
 *
 * 示例：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 */
public class _404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || root.left == null){
            return 0;
        }
        if(root.left.left == null){
            return root.left.val+sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        }else {
            return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        }
    }

    int res = 0;//存储结果

    public int sumOfLeftLeaves2(TreeNode root) {
        if(root==null)//root为空直接返回0
            return res;
        getSum(root);//递归函数,求得结果
        return res;
    }

    public void getSum(TreeNode root) {
        if (root.left != null) {//root.left不能为空
            //root.left为左叶子
            if (root.left.left == null && root.left.right == null)
                res += root.left.val;//结果增加
            else//否则继续递归
                getSum(root.left);
        }
        if (root.right != null)//root.right不能为空
            getSum(root.right);
    }

    public static void main(String[] args) {
        _404 test = new _404();
        int[] arrays = new int[]{0,2,4,1,0,3,-1,5,1,0,6,0,8};
        List<TreeNode> treeNodes = TreeNode.createBinaryTree(arrays);
        System.out.println(test.sumOfLeftLeaves(treeNodes.get(0)));
    }
}
