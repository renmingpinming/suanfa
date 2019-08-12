package zhou.yi.leetCode2.medium2;

import zhou.yi.leetCode.model.ListNode;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/2 13:47
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 */
public class _19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ahead = dummy;
        for (int i = 0; i <= n; i++) {
            ahead = ahead.next;
        }
        ListNode behind = dummy;
        while (ahead != null) {
            behind = behind.next;
            ahead = ahead.next;
        }
        behind.next = behind.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        _19 test = new _19();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        ListNode head = ListNode.createListNode(nums);
        test.removeNthFromEnd(head, 2);
    }
}
