package 斐波那契数列;

public class Solution {
    public int Fibonacci(int n) {
        int f = 1, g= 0;
        while(n-->0){
            g = g+f;
            f = g-f;
        }
        return g;
    }

}
