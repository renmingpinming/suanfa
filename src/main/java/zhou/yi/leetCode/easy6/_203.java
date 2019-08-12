package zhou.yi.leetCode.easy6;

import zhou.yi.leetCode.model.ListNode;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/26 8:53
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class _203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode pre = new ListNode(0);
        ListNode first = pre;
        pre.next = head;
        while (head != null) {
            if (head.val == val) {
                pre.next = head.next;
            } else {
                pre = pre.next;
            }
            head = head.next;
        }
        return first.next;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 6, 3, 4, 5, 6};
        ListNode head = ListNode.createListNode(nums);
        _203 test = new _203();
        head = test.removeElements(head, 6);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
