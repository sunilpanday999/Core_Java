package CoderByte;

import java.util.Scanner;

public class BracketMatcher {
    public static String BracketMatcher(String str) {
        // code goes here
        int first_count = 0;
        int second_count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                first_count++;
            }
            if(str.charAt(i) == ')'){
                second_count++;
            }
        }
        return (first_count == second_count) ? "1"  : "0";
//        if (count == count2) {
//            result =  "1";
//        }
//        else{
//            result = "0";
//        }
//        Stack<Character> stack = new Stack<>();
//        for(char c : str.toCharArray()){
//            if (c == '('){
//                stack.push(c);
//            }
//            else if (c==')'){
//                if (stack.size() == 0){
//                    return "0";
//                }
//                stack.pop();
//            }
//        }
//        return (stack.size()==0 ?"1":"0");

    }

    public static void main (String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
        System.out.print(BracketMatcher("((coder)(byte))"));
    }
}
