package 两个链表中的第一个公共结点;

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null||pHead2 == null)return null;
        int cnt1 = 0, cnt2 = 0;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while(p1 != null){
            p1 = p1.next;
            cnt1++;
        }
        while(p2 != null){
            p2 = p2.next;
            cnt2++;

        }
        p1 = pHead1;
        p2 = pHead2;
        int temp = cnt1 -cnt2;
        if(temp > 0){

            while (temp-- > 0){
                p1 = p1.next;
            }
        }else{
            int t = cnt2 - cnt1;
            while(t-- >0){
                p2= p2.next;
            }
        }
        while(p1 != null &&p2 != null){
            if(p1.val == p2.val){
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;

    }
}
