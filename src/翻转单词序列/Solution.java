package 翻转单词序列;

public class Solution {
    public String ReverseSentence(String str) {
        char[] my = str.toCharArray();
        int blank = -1;
        reserve(my, 0, my.length - 1);
        for(int i = 0; i<my.length; i++){
            if(my[i] == ' '){
                int nextblank = i;
                reserve(my, blank+1, nextblank-1);
                blank = nextblank;
            }
        }
        reserve(my, blank+1, my.length - 1);
        return new String(my);
    }
    public void reserve(char[] my, int start, int end){
        while(start < end){
            char temp = my[start];
            my[start] = my[end];
            my[end] = temp;
            start++;
            end--;
        }
    }
}
