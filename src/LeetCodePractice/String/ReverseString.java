package LeetCodePractice.String;

import java.util.Arrays;

public class ReverseString {

    public static void revString(char [] s){
//        char [] temp = new char[]{};
//        for(int i=0, j=s.length-1; i<j; i++, j--){
//            temp = s[i];
//            s[i] = s[j];
//            s[j] = temp;
//        }
        int i = 0;
        int j = s.length -1 ;
        while (i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        char [] s = {'H', 'E', 'L', 'L', '0'};
        revString(s);


    }
}
