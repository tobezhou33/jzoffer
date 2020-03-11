package 最小k个数;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer>ret = new ArrayList<>();
        if(input.length < k||k == 0)return ret;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for(int i = 0; i<input.length; i++){
            if(maxHeap.size() < k){
                maxHeap.add(input[i]);
            }else {
                if(input[i] < maxHeap.peek()){
                    maxHeap.poll();
                    maxHeap.add(input[i]);

                }
            }
        }

        for(Integer i:maxHeap ){
            ret.add(i);
        }
        return ret;
    }
}
