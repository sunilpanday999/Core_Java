package CoderByte;

import java.util.Scanner;

public class ReverseString {
    public static String FirstReverse(String str) {
        // code goes here
        String reverse_str = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse_str += str.charAt(i);
        }
        return reverse_str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }
}
