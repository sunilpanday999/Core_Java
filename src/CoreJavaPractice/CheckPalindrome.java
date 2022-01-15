package CoreJavaPractice;

public class CheckPalindrome {
    public static boolean isPalindrome(int x) {

//        String str = String.valueOf(x);
//        String rev = "";
//        for(int i = str.length()-1; i>=0; i--){
//            rev = rev + str.charAt(i);
//        }
//        if(rev.equals(str)){
//            return true;
//        }
//        return false;

    String str = Integer.toString(x);
    for(int i=0; i<str.length(); i++){
        if(str.charAt(i) != str.charAt(str.length()-1-i)){
            return false;
        }
    }
    return true;
    }

    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }
}
