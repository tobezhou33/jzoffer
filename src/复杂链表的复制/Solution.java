package 复杂链表的复制;

public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null)return null;

        RandomListNode cur = pHead;
        while(cur != null){
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next = clone;
            cur = clone.next;
        }

        cur = pHead;
        while(cur != null){
            RandomListNode clone = cur.next;
            if(cur.random != null){
                clone.random = cur.random.next;
            }
            cur = clone.next;
        }

        cur = pHead;
        RandomListNode pCloneHead = pHead.next;
        while(cur.next != null){
            RandomListNode next= cur.next;
            cur.next= next.next;
            cur = next;
        }

        return pCloneHead;
    }
}
