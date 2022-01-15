package CoreJavaPractice;

import java.util.Locale;

public class ReverseTheCase {
    public static String reverseCase(String str) {
        char [] c = str.toCharArray();
        for(int i=0; i<c.length; i++){
            if(Character.isUpperCase(c[i])){
                c[i]=Character.toLowerCase(c[i]);
            } else if(Character.isLowerCase(c[i])){
                c[i]=Character.toUpperCase(c[i]);
            }

        }
        str = new String(c);
        return str;
    }

    public static void main(String[] args) {
        String str = "Happy Birthday";
        System.out.println(reverseCase(str));
    }
}
