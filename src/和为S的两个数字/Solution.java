package 和为S的两个数字;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int p1 = 0,p2 = array.length - 1;
        ArrayList<Integer>ret = new ArrayList<>();
        while(p1 <p2){
            if(array[p1]+array[p2] == sum){
                ret.add(array[p1]);
                ret.add(array[p2]);
                return ret;
            }else if(array[p1] + array[p2] < sum){
                p1++;
            }else{
                p2--;
            }
        }
        return ret;
    }
}
