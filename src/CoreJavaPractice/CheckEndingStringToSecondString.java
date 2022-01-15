package CoreJavaPractice;

public class CheckEndingStringToSecondString {
    public static boolean checkEnding(String str1, String str2) {
        if(str1.endsWith(str2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abcd";
        String str2 = "bc";
        System.out.println(checkEnding(str,str2));
    }
}
