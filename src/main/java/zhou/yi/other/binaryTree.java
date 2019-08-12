package zhou.yi.other;

import java.util.*;

public class binaryTree {
    private int zhouYi;

    public static void main(String[] args) {
        binaryTree b = new binaryTree();
//        int[] nums = {1,2,3,4,5,6,7,8,9};
        int[] nums = {6, 10, 15, 23, 27, 33, 42};
        List<Node> tree = b.createBinaryTree(nums);
//        b.prOrder(tree.get(0));
//        System.out.println();
//        b.inOrder(tree.get(0));
//        System.out.println();
//        b.postOrder(tree.get(0));
//        System.out.println();
        b.dfs(tree.get(0));
        System.out.println();
        b.dfs2(tree.get(0));
//        System.out.println();
//        b.bfs(tree.get(0));
    }

    //创建二叉树
    public List<Node> createBinaryTree(int[] arrays) {
        List<Node> nodeList = new LinkedList<Node>();
        for (int i = 0; i < arrays.length; i++) {
            nodeList.add(new Node(arrays[i]));
        }
        for (int i = 0; i < nodeList.size() / 2 - 1; i++) {
            nodeList.get(i).setLeftNode(nodeList.get(i * 2 + 1));
            nodeList.get(i).setRightNode(nodeList.get(i * 2 + 2));
        }
        int index = nodeList.size() / 2 - 1;
        nodeList.get(index).setLeftNode(nodeList.get(index * 2 + 1));
        if (nodeList.size() % 2 == 1) {
            nodeList.get(index).setRightNode(nodeList.get(index * 2 + 2));
        }
        return nodeList;
    }

    //先序遍历
    public void prOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        prOrder(node.getLeftNode());
        prOrder(node.getRightNode());
    }

    //中序
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeftNode());
        System.out.print(node.getValue() + " ");
        inOrder(node.getRightNode());
    }

    //后序
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());
        System.out.print(node.getValue() + " ");
    }

    //深度优先
    public void dfs(Node node) {
        if (node == null) {
            return;
        }
        Stack<Node> nodeStacks = new Stack<Node>();
        nodeStacks.push(node);
        while (!nodeStacks.empty()) {
            Node popNode = nodeStacks.pop();
            System.out.print(popNode.getValue() + " ");
            if (popNode.getLeftNode() != null) {
                nodeStacks.push(popNode.getLeftNode());
            }
            if (popNode.getRightNode() != null) {
                nodeStacks.push(popNode.getRightNode());
            }
        }
    }

    public void dfs2(Node root) {
        if (root != null) {
            //preOrder
            System.out.println(root.getValue());
            dfs(root.getLeftNode());
            dfs(root.getRightNode());
        }
    }

    //广度优先
    public void bfs(Node node) {
        if (node == null) {
            return;
        }
        ArrayDeque<Node> nodeQueue = new ArrayDeque<Node>();
        nodeQueue.add(node);
        while (!nodeQueue.isEmpty()) {
            Node nodeR = nodeQueue.remove();
            System.out.print(nodeR.getValue() + " ");
            if (nodeR.getLeftNode() != null) {
                nodeQueue.add(nodeR.getLeftNode());
            }
            if (nodeR.getRightNode() != null) {
                nodeQueue.add(nodeR.getRightNode());
            }
        }
    }
}
