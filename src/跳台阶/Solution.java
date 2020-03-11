package 跳台阶;

public class Solution {
    public int JumpFloor(int target) {
        int f = 0, g = 1;
        while(target -- > 0){
            g = g + f;
            f = g - f;
        }
        return g;
    }
}
