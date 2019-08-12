package zhou.yi.leetCode2.easy8;

import zhou.yi.leetCode.model.ListNode;
import zhou.yi.leetCode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/13 18:25
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 */
public class _234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return Boolean.TRUE;
        }
        //求中间节点
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //后面半个链表反转
        ListNode pre = null;
        ListNode now = slow.next;
        ListNode temp = null;
        while (now != null) {
            temp = now.next;
            now.next = pre;
            pre = now;
            now = temp;
        }
        slow.next = pre;
        slow = slow.next;
        while (slow != null) {
            if (head.val != slow.val) {
                return Boolean.FALSE;
            }
            head = head.next;
            slow = slow.next;
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        _234 test = new _234();
        int[] nums = new int[]{1, 2, 2, 1};
        ListNode root = ListNode.createListNode(nums);
        System.out.println(test.isPalindrome(root));
    }
}
