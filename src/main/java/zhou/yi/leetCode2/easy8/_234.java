package zhou.yi.leetCode2.easy8;

import zhou.yi.leetCode.model.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/13 18:25
 */
public class _234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while (head!=null){
            nums.add(head.val);
        }
        int len = nums.size();
        for (int i = 0;i<len/2;i++) {

        }
        return Boolean.TRUE;
    }
}
