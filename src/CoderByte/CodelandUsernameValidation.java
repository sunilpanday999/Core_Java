package CoderByte;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodelandUsernameValidation {
    public static String CodelandUsernameValidation(String str) {
        String t = "true";
        String f = "false";
       if (str.length() > 4 && str.length() < 25 && Character.isLetter(str.charAt(0)) &&
       !str.endsWith("_")){
           return t;
       }
       return f;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }
}
