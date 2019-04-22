package zhou.yi.leetCode.easy3;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/19 9:44
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * 示例 1:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * 输出: true
 * 示例 2:
 *
 * 输入:      1          1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 *
 * 输出: false
 * 示例 3:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   1     1   2
 *
 *         [1,2,1],   [1,1,2]
 *
 * 输出: false
 */
public class _100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return Boolean.TRUE;
        }
        if(p == null || q == null || p.val != q.val){
            return Boolean.FALSE;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static void main(String[] args) {
        _100 test = new _100();
        int[] arr1 = new int[]{1,2,1};
        int[] arr2 = new int[]{1,0,3};
        List<TreeNode> t1 = test.createBinaryTree(arr1);
        List<TreeNode> t2 = test.createBinaryTree(arr2);
        System.out.println(test.isSameTree(t1.get(0),t2.get(0)));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

    //创建二叉树
    public List<TreeNode> createBinaryTree(int[] arrays){
        List<TreeNode> nodeList = new LinkedList<TreeNode>();
        for(int i = 0; i < arrays.length; i++){
            nodeList.add(new TreeNode(arrays[i]));
        }
        for (int i = 0; i < nodeList.size()/2-1;i++){
            nodeList.get(i).setLeft(nodeList.get(i * 2 + 1));
            nodeList.get(i).setRight(nodeList.get(i * 2 + 2));
        }
        int index = nodeList.size()/2-1;
        nodeList.get(index).setLeft(nodeList.get(index * 2 + 1));
        if(nodeList.size() % 2 == 1){
            nodeList.get(index).setRight(nodeList.get(index * 2 + 2));
        }
        return nodeList;
    }
}
