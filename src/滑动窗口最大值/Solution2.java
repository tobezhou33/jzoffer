package 滑动窗口最大值;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution2 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer>res = new ArrayList<>();
        LinkedList<Integer>qmax = new LinkedList<>();
        if (size <= 0 ||num.length == 0 || num == null|| num.length < size)return res;
        for (int i = 0; i < num.length; i++){
            while (!qmax.isEmpty()&& num[i] > num[qmax.peekLast()]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (i - qmax.peekFirst() == size){
                qmax.pollFirst();
            }
            if (i >= size-1){
                res.add(num[qmax.peekFirst()]);
            }
        }

        return res;
    }
}
