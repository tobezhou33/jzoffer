package 左旋转字符串;

public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str == null||n< 0||n>str.length())return "";
        StringBuilder ret = new StringBuilder(str);
        ret.append(str.substring(0, n));
        return ret.substring(n, ret.length());

    }
}
