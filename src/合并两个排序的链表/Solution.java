package 合并两个排序的链表;

public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1== null && list2==null)return null;
        if(list1 == null && list2!= null)return list2;
        if(list2 == null && list1 != null)return list1;

        ListNode newList = new ListNode(-1);
        ListNode curr = newList;
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                curr.next = list2;
                list2 = list2.next;
            }else {
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;

        }
        while(list1 != null){
            curr.next = list1;
            list1 = list1.next;
            curr = curr.next;
        }
        while(list2 != null){
            curr.next = list2;
            list2 = list2.next;
            curr = curr.next;
        }
        return newList.next;
    }
}
