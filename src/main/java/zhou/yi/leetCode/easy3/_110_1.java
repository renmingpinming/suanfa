package zhou.yi.leetCode.easy3;

import zhou.yi.leetCode.model.TreeNode;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/22 10:55
 */
public class _110_1 {
    public final int UNB = -99;
    public boolean isBalanced(TreeNode root) {
        int result = balanceJudge(root);
        if(result != UNB)return true;
        else return false;
    }

    public int balanceJudge(TreeNode root){
        if(root==null)return 0;
        int l = balanceJudge(root.left);
        int r = balanceJudge(root.right);
        if(l==UNB || r== UNB || Math.abs(l-r)>1) return UNB;
        return 1+(l>r?l:r);
    }
}
