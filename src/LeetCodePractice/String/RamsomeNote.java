package LeetCodePractice.String;

import java.util.HashMap;
import java.util.Map;

public class RamsomeNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<ransomNote.length(); i++){
            char c2 = ransomNote.charAt(i);
            if(!map.containsKey(c2) || map.get(c2)==0){
                return false;
            }
            else{
                map.put(c2, map.get(c2)-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String Ransom_Note = "morning";
        String Magazine = "abcghimnoprsnab";
        System.out.println(canConstruct(Ransom_Note, Magazine));

//        String str = "SUNIL";
//        Map<Character, Integer> map = new HashMap<>();
//        map.put('U', 1);
//        for(int i=0; i<str.length(); i++) {
//            char c = str.charAt(i);
//            System.out.println(map.get(c));
//
//        }
    }
}
