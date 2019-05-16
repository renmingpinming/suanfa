package zhou.yi.leetCode2.easy8;

import zhou.yi.leetCode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/15 18:02
 */
public class _257_1 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> rst = new ArrayList<>();
        if (root == null) {
            return rst;
        }
        dfs(rst, new ArrayList<>(), root);
        return rst;
    }

    public void dfs(List<String> rst, List<Integer> list, TreeNode node) {
        if (node == null) return;

        list.add(node.val);
        if (node.left == null && node.right == null) {
            rst.add(convert(list));
            list.remove(list.size() - 1);
            return;
        }

        dfs(rst, list, node.left);
        dfs(rst, list, node.right);
        list.remove(list.size() - 1);
    }

    private String convert(List<Integer> list) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < list.size() - 1; i++) {
            sb.append(list.get(i) + "->");
        }
        sb.append(list.get(list.size() - 1));
        return sb.toString();
    }
}
