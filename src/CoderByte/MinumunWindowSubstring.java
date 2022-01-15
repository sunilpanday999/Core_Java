package CoderByte;

import java.util.Scanner;

public class MinumunWindowSubstring {
    public static String MinWindowSubstring(String[] strArr) {
       String N = strArr[0];
       String K = strArr[1];
       String result = "";
       int min = Integer.MAX_VALUE;
       for(int i=0; i<N.length(); i++){
           StringBuilder match = new StringBuilder(K);
           for(int j=i; j<N.length(); j++){
               if(match.toString().contains(String.valueOf(N.charAt(j)))){
                  int index =  match.toString().indexOf(String.valueOf(N.charAt(j)));
                  match.replace(index, index+1, "");
               }
               if(match.length() == 0){
                   if(j - i < min){
                       min = j - i;
                       result = N.substring(i, j+1);
                   }
                   break;
               }
           }
       }
       return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.print(MinWindowSubstring(new String[] {"ahffaksfajeeubsne", "jefaa"}));
    }
}
