package zhou.yi.leetCode.model;

import java.util.Objects;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/23 9:42
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }

    public static ListNode createListNode(int[] nums){
        if (nums == null || nums.length == 0){
            return null;
        }
        ListNode head = new ListNode(0);
        ListNode node = head;
        for (int num:nums) {
            node.next = new ListNode(num);
            node = node.next;
        }
        return head.next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {

        return Objects.hash(val, next);
    }
}
