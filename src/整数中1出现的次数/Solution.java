package 整数中1出现的次数;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {

        int count=0;
        int i=1;
        for(i=1;i<=n;i*=10)
        {
            int a = n/i,b = n%i;
            // count=count+(a+8)/10*i+(a%10==1)*(b+1);
            count = count +(a+8)/10*i +(a%10 ==1?1:0)*(b+1);
        }
        return count;

    }
}
