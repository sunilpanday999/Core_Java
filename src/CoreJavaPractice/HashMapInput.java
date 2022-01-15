package CoreJavaPractice;

import java.util.*;

public class HashMapInput {
    public static void main(String[] args) {
        String str = "abcabccbccbaaa";

        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            set.add(c);
        }

        int result = set.size();
        System.out.println(result);



    }
}
