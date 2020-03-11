package 反转链表;

import java.util.Stack;

public class Solution2 {
    public int[] reversePrint(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode p = head;
        int count = 0;
        while (p != null){
            stack.push(p.val);
            p = p.next;
            count++;
        }
        int[] res = new int[count];
        int i = 0;
        while (!stack.isEmpty()){
            res[i++] = stack.pop();
        }
        return res;
    }
}
