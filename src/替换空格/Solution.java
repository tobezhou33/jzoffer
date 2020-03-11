package 替换空格;

public class Solution {
    public String replaceSpace(StringBuffer str) {
        int p2 = str.length()-1;
        for(int i = 0;i <= p2; i++){
            if(str.charAt(i) == ' '){
                str.append("  ");
            }
        }
        int p1 = str.length()-1;
        while(p1 > p2 && p2 >=0){
            if(str.charAt(p2) == ' '){
                str.setCharAt(p1--, '0');
                str.setCharAt(p1--, '2');
                str.setCharAt(p1--, '%');
            }else{
                str.setCharAt(p1--, str.charAt(p2));
            }
            p2--;
        }
        return str.toString();
    }
}
