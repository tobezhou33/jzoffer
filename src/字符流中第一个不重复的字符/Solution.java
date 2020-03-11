package 字符流中第一个不重复的字符;

public class Solution {
    StringBuffer s = new StringBuffer();
    int[] count = new int[256];
    public void Insert(char ch)
    {
        s.append(ch);
        count[ch]++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] chs = s.toString().toCharArray();
        for(int i = 0; i<chs.length; i++){
            if(count[chs[i]] == 1){
                return chs[i];
            }
        }
        return '#';
    }
}
