package 包含min函数的栈;

import java.util.Stack;

public class Solution {

    Stack<Integer> minstack = new Stack<>();
    Stack<Integer>datastack = new Stack<>();
    public void push(int node) {
        datastack.push(node);
        minstack.push(minstack.empty()?node  : (minstack.peek()< node?minstack.peek():node));
    }

    public void pop() {
        datastack.pop();
        minstack.pop();
    }

    public int top() {
        return datastack.peek();
    }

    public int min() {
        return minstack.peek();
    }
}
