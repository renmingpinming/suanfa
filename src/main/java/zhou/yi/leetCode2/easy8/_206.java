package zhou.yi.leetCode2.easy8;

import zhou.yi.leetCode.model.ListNode;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/9 18:34
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class _206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode now = head;
        ListNode temp = null;
        while (now!=null){
            temp = now.next;
            now.next = pre;
            pre = now;
            now = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        _206 test = new _206();
        int[] nums = new int[]{1,2,3,4,5};
        ListNode head = ListNode.createListNode(nums);
        head = test.reverseList(head);
        while (head!= null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
