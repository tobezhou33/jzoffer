package 链表中环的入口节点;

public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null||pHead.next == null)return null;
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while (p1 != null && p2 != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                p1 = pHead;
                while (p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                if (p1 == p2)return p1;
            }
        }
        return null;
    }
}
