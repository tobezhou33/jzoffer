package 数组中只出现一次的数字;

public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length == 2){
            num1[0] = array[0];
            num2[0] = array[1];
            return ;
        }
        int num = 0;
        for(int i = 0; i< array.length; i++){
            num^=array[i];
        }
        int index = find(num);
        for(int i = 0; i<array.length; i++){
            if(isBit(array[i], index)){
                num1[0] ^= array[i];
            }else {
                num2[0] ^= array[i];
            }
        }
    }

    public int find(int num){
        int index = 0;
        while(((num & 1) == 0)&& index <32){
            num >>= 1;
            index++;
        }
        return index;
    }
    public boolean isBit(int num, int index){
        return ((num>>index)&1) == 1;
    }
}
