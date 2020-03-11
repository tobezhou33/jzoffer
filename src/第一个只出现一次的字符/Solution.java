package 第一个只出现一次的字符;

import java.util.LinkedHashMap;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        LinkedHashMap<Character, Integer>map = new LinkedHashMap<>();
        for(int i = 0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                int times  = map.get(str.charAt(i));
                map.put(str.charAt(i), ++times);
            }else {
                map.put(str.charAt(i), 1);
            }
        }

        int pos = -1;
        for(int i = 0; i<str.length();i++){
            if(map.get(str.charAt(i)) == 1)
                return i;
        }
        return pos;
    }
}
