package 数组中出现超过一半的数字;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null)return 0;
        int ret = 0;
        int time = 0;
        for(int i = 0; i< array.length; i++){
            if(time == 0){
                ret = array[i];
                time++;
            }else if(array[i] == ret ){
                time++;
            }else time--;
        }

        if(time <= 0)return 0;
        int count = 0;
        for(int i= 0; i<array.length; i++){
            if(array[i] == ret)
                count++;
        }
        if(array.length/count<2)return ret;
        return 0;
    }
}
