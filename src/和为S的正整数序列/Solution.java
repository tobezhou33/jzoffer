package 和为S的正整数序列;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>>ret  = new ArrayList<>();
        int p1 = 1, p2 = 2;
        while(p1 < p2){
            int temp = (p1+p2)*(p2-p1+1)/2;
            if(temp == sum){
                ArrayList<Integer>list = new ArrayList<>();
                for(int i = p1; i<=p2; i++){
                    list.add(i);
                }
                ret.add(list);
                p1++;
            }else if(temp < sum){
                p2++;
            }else{
                p1++;
            }
        }
        return ret;
    }
}
