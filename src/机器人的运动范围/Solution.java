package 机器人的运动范围;

public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] flag = new boolean[rows][cols];
        return help(0,0,threshold, rows, cols, flag);
    }
    public int help(int i, int j, int threshold, int rows, int cols, boolean[][] flag){
        if(i<0||j<0||i>=rows||j>=cols||flag[i][j]==true||(numget(i)+numget(j))> threshold){
            return 0;
        }
        flag[i][j] = true;
        return 1+ help(i+1,j,threshold, rows, cols, flag)+
                help(i-1,j,threshold, rows, cols, flag)+
                help(i,j-1,threshold, rows, cols, flag)+
                help(i,j+1,threshold, rows, cols, flag);
    }

    public int numget(int number){
        int sum = 0;
        while(number >0){
            sum += number%10;
            number = number/10;
        }
        return sum;

    }

}
