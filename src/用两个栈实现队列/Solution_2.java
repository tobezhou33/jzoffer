package 用两个栈实现队列;

import java.util.Stack;

public class Solution_2 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public Integer pop(){
        if (!s2.empty()){
            return s2.pop();
        }else {
            while (!s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public void push(int num){
        s1.push(num);
    }
}
