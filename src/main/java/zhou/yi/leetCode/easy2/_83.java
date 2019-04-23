package zhou.yi.leetCode.easy2;

import zhou.yi.leetCode.model.ListNode;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/18 17:00
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
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


    public static void main(String[] args) {
        _83 test = new _83();
        int[] numsA = new int[]{1,1,1};
        zhou.yi.leetCode.model.ListNode headA = zhou.yi.leetCode.model.ListNode.createListNode(numsA);
        ListNode rst = test.deleteDuplicates(headA);
        while (rst != null){
            System.out.println(rst.val);
            rst = rst.next;
        }
    }
}
