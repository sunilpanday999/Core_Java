package LeetCodePractice.String;

public class CheckContinuousAppears {

    public static boolean checkString(String s){

        int a = s.lastIndexOf('a');
        int b = s.indexOf('b');
//        System.out.println(s.indexOf('b'));
//        System.out.println(s.lastIndexOf('a')+1);
        if(a+1 == b || s.indexOf('b') == -1 && s.indexOf('a') == 0){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s = "abab";
        System.out.println(checkString(s));
    }
}
