package zhou.yi.leetCode.easy2;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/18 17:00
 */
public class _83 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null){
            if (temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        _83 test = new _83();
        ListNode l1 = new ListNode(1);
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
//        ListNode c = new ListNode(3);
//        ListNode d = new ListNode(3);
        l1.next = a;
        a.next = b;
//        b.next = c;
//        c.next = d;
        ListNode rst = test.deleteDuplicates(l1);
        while (rst != null){
            System.out.println(rst.val);
            rst = rst.next;
        }
    }
}
