package 字符串的排列;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str == null)return res;
        Per(str.toCharArray(), 0, res);
        Collections.sort(res);
        return res;
    }
    public void Per(char[] arr, int i, ArrayList<String> res){
        if(i == arr.length - 1){
            String val = String.valueOf(arr);
            if(!res.contains(val)){
                res.add(val);
            }
        }else {
            for(int j = i; j< arr.length;j++){
                swap(arr, i, j);
                Per(arr, i+1, res);
                swap(arr, i, j);
            }
        }
    }
    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
