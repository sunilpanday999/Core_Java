package LeetCodePractice.String;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s){
        if (s == null || s.length() == 0) return 0;
        String [] str = s.split(" ");

        return str[str.length-1].length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
