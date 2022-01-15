package LeetCodePractice.String;

import java.util.*;

public class ReverseVowelsOfString {

    public static String reverseVowels(String s){

        /*
        List<Character> vowelList = new ArrayList<>();
        vowelList.add('a');
        vowelList.add('e');
        vowelList.add('i');
        vowelList.add('o');
        vowelList.add('u');
        vowelList.add('A');
        vowelList.add('E');
        vowelList.add('I');
        vowelList.add('O');
        vowelList.add('U');

        char[] c = s.toCharArray();
        int i =0;
        int j = s.length() - 1;
        while (i < j){
            if(!vowelList.contains(c[i])){
                i++;
                continue;
            }
            if(!vowelList.contains(c[j])){
                j--;
                continue;
            }
            char t = c[i];
            c[i] = c[j];
            c[j]= t;

            i++;
            j--;
        }
        return new String(c);

         */

        char [] chars = s.toCharArray();
        List<Character> vowelList = Arrays.asList('a', 'e', 'i','o','u','A','E','I','O','U');
        Set<Character> set = new HashSet<>();
        set.addAll(vowelList);

        int i=0;
        int j=s.length()-1;
        while(i<j){

            if(!set.contains(chars[i])){
                i++;
            }
            else if(!set.contains(chars[j])){
                j--;
            }
            else{
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;

                i++;
                j--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(reverseVowels(s));
    }
}
