package 矩形覆盖;

public class Solution {
    public int RectCover(int target) {
        if(target <= 2){
            return target;
        }
        int f = 0, g = 1;
        while(target -- > 0){
            g = g + f;
            f = g - f;
        }
        return g;
    }
}
