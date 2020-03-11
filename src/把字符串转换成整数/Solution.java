package 把字符串转换成整数;

public class Solution {
    public int StrToInt(String str) {
        if(str.length() == 0||str == "")return 0;
        long sum = 0;
        int flag = 0;
        char[] ch = str.toCharArray();
        if(ch[0] == '-'){
            flag = 1;
        }
        for(int i = flag; i< ch.length; i++){
            if(ch[i] =='+')continue;
            if(ch[i] < 48 || ch[i] > 57){
                return 0;
            }else {
                sum = sum*10 + ch[i] - '0';
            }
        }
        if(flag == 1)sum = -sum;
        if(sum > Integer.MAX_VALUE||sum<Integer.MIN_VALUE)return 0;
        return (int)sum;
    }

}
