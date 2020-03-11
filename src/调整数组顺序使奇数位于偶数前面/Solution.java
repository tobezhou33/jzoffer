package 调整数组顺序使奇数位于偶数前面;

public class Solution {
    public void reOrderArray(int [] array) {

        int cnt= 0;
        for(int x: array){
            if(x%2 == 1)
                cnt++;
        }
        int[] temp = array.clone();
        int i = 0, j = cnt--;
        for(int x : temp){
            if(x% 2== 1){
                array[i++] =  x;
            }else {
                array[j++] = x;
            }

        }
    }
}
