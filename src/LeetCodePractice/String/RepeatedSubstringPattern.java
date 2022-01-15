package LeetCodePractice.String;

public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        /*
        char [] arr = s.toCharArray();
        String str = "";
        for(int i=0; i<arr.length; i++){
           for(int j=i; j<arr.length; j++){
               if(arr[i] != arr[j] && !str.contains()){
                   str += arr[i];
               }
           }
        }
        return str;
         */

        int i=0;
        for(int j=i+1; j<s.length(); j++){

            StringBuilder strBudr1 = new StringBuilder(s.substring(i, j));
            StringBuilder strBudr2 = new StringBuilder(s.substring(j));
            strBudr2.append(strBudr1);

            if(strBudr2.toString().equals(s)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcabcabc";
        System.out.println(repeatedSubstringPattern(s));
    }
}
