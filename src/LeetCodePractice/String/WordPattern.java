package LeetCodePractice.String;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String [] arr = s.split(" ");
        if(arr.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                String value = map.get(c);
                if(!value.equals(arr[i])){
                    return false;
                }
            }
            else if(map.containsValue(arr[i])){
                return false;
            }
            map.put(c, arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));
    }
}
