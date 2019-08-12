package zhou.yi.leetCode.easy;

import zhou.yi.leetCode.model.ListNode;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/16 13:41
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class _21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode l3 = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                l3.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                l3.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            l3 = l3.next;
        }
        if (l1 != null) {
            l3.next = l1;
        }
        if (l2 != null) {
            l3.next = l2;
        }
        return head.next;
    }

    public static void main(String[] args) {
        _21 test = new _21();
        int[] numsA = new int[]{1, 2, 4};
        int[] numsB = new int[]{1, 3, 4};
        zhou.yi.leetCode.model.ListNode headA = zhou.yi.leetCode.model.ListNode.createListNode(numsA);
        zhou.yi.leetCode.model.ListNode headB = zhou.yi.leetCode.model.ListNode.createListNode(numsB);
        ListNode l3 = test.mergeTwoLists(headA, headB);
        while (l3 != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }
}
