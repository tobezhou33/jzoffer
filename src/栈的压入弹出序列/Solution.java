package 栈的压入弹出序列;

import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA == null || popA == null || popA.length != pushA.length)return false;
        Stack<Integer>stack = new Stack<>();
        int popIndex = 0;
        for(int i = 0; i< pushA.length; i++){
            stack.push(pushA[i]);
            while(!stack.empty()&&popA[popIndex] == stack.peek()){
                stack.pop();
                popIndex ++;
            }
        }
        return stack.empty();
    }
}
