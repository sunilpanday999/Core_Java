package CoderByte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestWord {
    public static String LongestWord(String sen) {
        // code goes here
        /*
        Have the function LongestWord(sen) take the sen parameter being passed and
        return the longest word in the string. If there are two or more words that
        are the same length, return the first word from the string with that length.
        Ignore punctuation and assume sen will not be empty. Words may also contain
        numbers, for example "Hello world123 567"
        return sen;
         */
        String longestWord = "";
        String [] senArray = sen.split("[^a-z^0-9]");
        for(int i=0; i< senArray.length; i++){
            if(senArray[i].length() > longestWord.length()){
                longestWord = senArray[i];
            }
        }
        return longestWord;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}
