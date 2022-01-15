package LeetCodePractice.String;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s_map = new HashMap<>();
        Map<Character, Character> t_map = new HashMap<>();

        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();

        for(int i=0; i<s_char.length; i++){
            if (s_map.containsKey(s_char[i]) && s_map.get(s_char[i]) != t_char[i]) return false;
            if (t_map.containsKey(t_char[i]) && t_map.get(t_char[i]) != s_char[i]) return false;

            s_map.put(s_char[i], t_char[i]);
            t_map.put(t_char[i], s_char[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s, t));

    }
}
