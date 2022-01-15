package CoreJavaPractice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class LengthOfStringWithoutDuplicates {

//    public static int subStringLength(String s){
//        Set<Character> set = new HashSet<>();
//        for(int i=0; i<s.length(); i++){
//            char c = s.charAt(i);
//            set.add(c);
//        }
//        return set.size();
//    }
//    public static void main(String[] args) {
//        String input = "abcabcbbcc";
//        System.out.println(subStringLength(input));
//    }

    public static void subStringLength(String str) {
        //Convert inputString to charArray
        char[] charArray = str.toCharArray();
        //Initialization
        String longestSubstring = null;
        int longestSubstringLength = 0;

        //Creating LinkedHashMap with characters as keys and their position as values.
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
        //Iterating through charArray
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            //If ch is not present in charPosMap, adding ch into charPosMap along with its position
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            }
            //If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap
            else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            //Updating longestSubstring and longestSubstringLength

            if (charPosMap.size() > longestSubstringLength) {
                longestSubstringLength = charPosMap.size();
                longestSubstring = charPosMap.keySet().toString();
            }
        }

        System.out.println("Input String : " + str);
        System.out.println("The longest substring : " + longestSubstring);
        System.out.println("The longest Substring Length : " + longestSubstringLength);

    }



    public static void main(String[] args) {
        subStringLength("javaconceptoftheday");
        System.out.println("==========================");
        subStringLength("thelongestsubstring");
    }
}
