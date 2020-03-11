package 数据流中的中位数;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer>maxHeap = new PriorityQueue<>(15, new Comparator<Integer>(){
        @Override
        public int compare(Integer o1, Integer o2){
            return o2 -o1;
        }
    });
    private int count = 0;
    public void Insert(Integer num) {
        if(count %2 == 0){
            maxHeap.offer(num);
            int temp = maxHeap.poll();
            minHeap.offer(temp);
        }else {
            minHeap.offer(num);
            int  temp = minHeap.poll();
            maxHeap.offer(temp);
        }
        count ++;
    }

    public Double GetMedian() {
        if(count%2 == 0)
            return new Double((minHeap.peek()+maxHeap.peek()))/2;
        else {
            return new Double(minHeap.peek());
        }
    }
}
