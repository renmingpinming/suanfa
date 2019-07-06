package zhou.yi.leetCode2.medium2;

import zhou.yi.leetCode.model.ListNode;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/3 16:15
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 *  
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 */
public class _24 {
    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null){
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }

    public static void main(String[] args) {
        _24 test = new _24();
        ListNode head = ListNode.createListNode(new int[]{1,2,3,4});
        head=test.swapPairs(head);
        while (head!= null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
