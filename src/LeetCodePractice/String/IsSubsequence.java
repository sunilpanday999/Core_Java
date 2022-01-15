package LeetCodePractice.String;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t){
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;

        int index = 0;
        for(int i=0; i<t.length(); i++){
            char temp = s.charAt(index);
            if(t.charAt(i) == temp) index++;
            if(index >= s.length()) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
