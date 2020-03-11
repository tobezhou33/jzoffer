package 剪绳子;

public class Solution {
    public int cutRope(int target) {
        if(target == 2)return 1;
        if(target == 3)return 2;

        int time3= target/3;
        if(target - time3*3  == 1){
            time3 -= 1;
        }
        int time2 = (target - time3*3)/2;
        return (int)Math.pow(3, time3)*(int)Math.pow(2, time2);

    }
}
