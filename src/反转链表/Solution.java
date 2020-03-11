package 反转链表;

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null)return null;
        ListNode newList = new ListNode(-1);
        while(head != null){
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            head = next;
        }

        return newList.next;
    }
}
