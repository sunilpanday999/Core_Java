package LeetCodePractice.String;

public class ValidPalindrome {

    public static boolean validPalindrome (String s){
        if(s == null || s.length() == 0) return false;

        //"A man, a plan, a canal: Panama"
        String str = s.replaceAll("[^a-zA-Z0-9]+", "");

        String reverseString = "";
        for(int i=str.length()-1; i>=0; i--){
            reverseString += str.charAt(i);
        }
        if(str.equalsIgnoreCase(reverseString)){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(validPalindrome(s));
    }
}
