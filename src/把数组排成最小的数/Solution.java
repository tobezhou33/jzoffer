package 把数组排成最小的数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        if(numbers == null)return null;
        for(int i = 0; i< numbers.length; i++){
            list.add(numbers[i]);
        }

        Collections.sort(list, new Comparator<Integer>(){

            public int compare(Integer t1, Integer t2){
                String s1 = t1 +""+t2;
                String s2 = t2+""+t1;
                return s1.compareTo(s2);
            }

        });
        String s = "";
        for(int i: list){
            s+=i;
        }

        return s;
    }
}
