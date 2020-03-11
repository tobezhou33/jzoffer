package 数值的整数次方;

import org.junit.Test;

public class Solution {
    public double Power(double base, int exponent) {
        if(exponent == 0)
            return 1;
        if(exponent == 1)
            return base;
        boolean isNegative = false;
        if(exponent < 0)
        {
            isNegative = true;
            exponent = - exponent;
        }

        double pow = Power(base*base, exponent / 2);
        if(exponent %2 == 1){
            pow = pow * base;
        }
        return isNegative? 1/pow :pow;
    }
    @Test
    public void test(){
        double n = Power(2, 10);
        System.out.println(n);
    }
}
