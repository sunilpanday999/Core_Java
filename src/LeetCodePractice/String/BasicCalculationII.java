package LeetCodePractice.String;

import java.util.Stack;

public class BasicCalculationII {
    // with stack

    public static int calculate(String s) {

        if(s == null || s.length() == 0) return 0;
        int current_value =0;
        char operator = '+';
        char [] chr = s.toCharArray();

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(chr[i])){
                current_value = current_value * 10 + chr[i] - '0';
            }
            if(!Character.isDigit(chr[i]) && chr[i] != ' ' || i == chr.length -1){
                if(operator == '+'){
                    stack.push(current_value);
                }
                else if(operator == '-'){
                    stack.push(-current_value);
                }
                else if(operator == '*'){
                    stack.push(stack.pop() * current_value);
                }
                else if(operator == '/'){
                    stack.push(stack.pop() / current_value);
                }
                operator = chr[i];
                current_value = 0;
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
        
    }

     /*

    //without stack
    public static int calculate(String s) {

        if(s == null || s.length() == 0) return 0;

        int current_value = 0;
        int operator_sign = '+';
        int last_value = 0;
        int sum =0;

        char [] c = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(c[i])){
                current_value = current_value *10 + c[i] - '0';
            }
            if(!Character.isDigit(c[i]) && c[i] != ' ' || i == c.length -1){
                if(operator_sign == '+'){
                    sum += last_value;
                    last_value = current_value;
                }
                else if(operator_sign == '-'){
                    sum += last_value;
                    last_value =- current_value;
                }
                else if(operator_sign == '*'){
                    last_value = last_value * current_value;
                }
                else if (operator_sign == '/'){
                    last_value = last_value / current_value;
                }
                operator_sign = c[i];
                current_value =0;
            }
        }
        sum += last_value;
        return sum;
    }

      */


    public static void main(String[] args) {
        String s = "3+4*10/2";
        System.out.println(calculate(s));
    }
}
