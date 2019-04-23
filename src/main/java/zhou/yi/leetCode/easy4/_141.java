package zhou.yi.leetCode.easy4;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/22 17:37
 * 给定一个链表，判断链表中是否有环。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * 示例 1：
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * 示例 2：
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 * 示例 3：
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 */
public class _141 {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return Boolean.FALSE;
        }
        ListNode slow = head;
        ListNode quick = head.next;
        while (quick.next != null && quick.next.next != null){
            if(quick == slow){
                return Boolean.TRUE;
            }
            slow = slow.next;
            quick = quick.next.next;
        }
        return Boolean.FALSE;
    }

    public static void main(String[] args) {
        _141 test = new _141();
        ListNode l1 = new ListNode(3);
//        ListNode a = new ListNode(2);
//        ListNode b = new ListNode(0);
//        ListNode c = new ListNode(-4);
//        l1.next = a;
//        a.next = b;
//        b.next = c;
//        c.next = a;
        test.hasCycle(l1);
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
