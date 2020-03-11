package 滑动窗口最大值;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if (num == null || num.length == 0 || size <= 0 || num.length < size) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer>res = new ArrayList<>();
        LinkedList<Integer> qmax = new LinkedList<>();
        for(int i = 0; i< num.length; i++){
            while(!qmax.isEmpty()&&num[i] > num[qmax.peekLast()]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if(qmax.peekFirst() == i - size){
                qmax.pollFirst();
            }
            if(i >=size -1){
                res.add(num[qmax.peekFirst()]);
            }
        }
        return res;
    }
}
