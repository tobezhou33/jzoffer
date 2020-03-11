package 二维数组中的查找;

import org.junit.Test;

public class Solution {
    public boolean Find(int target, int [][] array) {

        if(array == null||array.length == 0||array[0].length == 0)return false;
        int row = array.length;
        int col = array[0].length;
        int i = row - 1;
        int j = 0;
        while(j < col && i >= 0 ){
            if(target > array[i][j]){
                j++;
            }else if(target < array[i][j]){
                i--;
            }else if(target == array[i][j]){
                return true;
            }
        }
        return false;
    }

    @Test
    public void Test(){
        System.out.println("111");
    }
}
