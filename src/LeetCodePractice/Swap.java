package LeetCodePractice;

public class Swap {
    public static boolean buddyStrings(String s, String goal) {
        String temp = "";
        for(int i=s.length()-1; i>=0; i--){
            temp += s.charAt(i);
        }
        return (temp.equals(goal)) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ba"));
    }
}
//abcde
// temp = a
//c[0] = b
// c[j] = a