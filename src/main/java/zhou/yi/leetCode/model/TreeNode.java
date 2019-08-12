package zhou.yi.leetCode.model;

import lombok.Data;
import zhou.yi.leetCode.easy3._100;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/13 17:29
 */
@Data
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    //创建二叉树
    public static List<TreeNode> createBinaryTree(int[] arrays) {
        List<TreeNode> nodeList = new LinkedList<TreeNode>();
        for (int i = 0; i < arrays.length; i++) {
            nodeList.add(new TreeNode(arrays[i]));
        }
        for (int i = 0; i < nodeList.size() / 2 - 1; i++) {
            nodeList.get(i).setLeft(nodeList.get(i * 2 + 1));
            nodeList.get(i).setRight(nodeList.get(i * 2 + 2));
        }
        int index = nodeList.size() / 2 - 1;
        nodeList.get(index).setLeft(nodeList.get(index * 2 + 1));
        if (nodeList.size() % 2 == 1) {
            nodeList.get(index).setRight(nodeList.get(index * 2 + 2));
        }
        return nodeList;
    }
}
