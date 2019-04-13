package zhou.yi.leetCode.medium;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/12 16:55
 */
public class _2_1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args){
        _2_1 test = new _2_1();
        ListNode l1 = new ListNode(2);
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(3);
        ListNode l2 = new ListNode(5);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(4);
        l1.next = a;
        a.next = b;
        l2.next = c;
        c.next = d;
        ListNode rst = test.addTwoNumbers(l1,l2);
        while (rst.next != null){
            System.out.print(rst.val+"->");
            rst = rst.next;
            if(rst.next == null){
                System.out.print(rst.val);
            }
        }
    }
}

