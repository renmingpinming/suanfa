package zhou.yi.leetCode;

import java.math.BigInteger;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/12 15:25
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class _2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger sum;
        if(l1.val == 0 &&l2.val ==0){
            return new ListNode(0);
        }
        if(l1.val ==0){
            sum = listToInt(l2);
        }else if (l2.val == 0){
            sum = listToInt(l1);
        }else {
            sum = listToInt(l1).add(listToInt(l2));
        }
        String str = sum.toString();
        int size = str.length();
        ListNode head = null;
        ListNode node = null;
        for(int i = 0; i < size; i++){
            node = new ListNode(Character.getNumericValue(str.charAt(i)));
            node.next = head;
            head = node;
        }
        return head;
    }

    public BigInteger listToInt(ListNode list){
        StringBuilder numStr = new StringBuilder();
        if(list.next == null){
            numStr.append(list.val);
        }
        while (list.next != null){
            numStr.insert(0,list.val);
            list = list.next;
            if(list.next == null){
                numStr.insert(0,list.val);
            }
        }
        if(numStr.toString().length()!=0){
            return new BigInteger(numStr.toString());
        }
        return  null;
    }

    public static void main(String[] args){
        _2 test = new _2();
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
//        ListNode l1 = new ListNode(0);
//        ListNode l2 = new ListNode(1);
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


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}