package 旋转数组的最小数字;

public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array == null)return 0;
        int l = 0, h = array.length-1;
        while(l < h){
            int m = l + (h-l)/2;
            if(array[m]  <= array[h])
                h = m;
            else
                l = m+1;
        }
        return array[l];
    }
}
