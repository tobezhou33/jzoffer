package 数字在排序数组中出现的次数;

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if(array.length == 0)return 0;
        int start = 0, end = array.length- 1;

        while(start <=end){
            int mid =start+  (end-start)/2;
            if(k > array[mid]){
                start = mid + 1;
            }else if(k < array[mid]){
                end = mid - 1;
            }else{
                int i = mid, j = mid;
                while(i>=0 && array[i] == k)i--;
                while(j <= end && array[j] == k)j++;

                return j-i -1;
            }
        }
        return 0;
    }
}
