package 构建乘积数组;

public class Solution {
    public int[] multiply(int[] A) {
        int n = A.length;
        int[] res = new int[n];
        int ret = 1;
        for(int i = 0; i< n; ret *= A[i++]){
            res[i] = ret;
        }
        ret = 1;
        for(int i = n-1; i>=0; ret *= A[i--]){
            res[i] *= ret;
        }
        return res;
    }
}
