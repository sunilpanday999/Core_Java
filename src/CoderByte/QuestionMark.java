package CoderByte;

import java.util.Scanner;

public class QuestionMark {
    public static String QuestionsMarks(String str) {
        // code goes here
        String result = "";
        for (int i=0; i<str.length(); i++){
          for (int j=i; j<str.length(); j++){
              if(str.charAt(i) == str.charAt(j)){
                  result = "true";
              }
              else{
                  result = "false";
              }
          }
        }
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }
}
