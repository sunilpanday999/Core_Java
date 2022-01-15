package LeetCodePractice.TOP100;

import java.util.Stack;

public class ValidParentheses {

    public static boolean validParentheses(String s){
        Stack<Character> leftSymbol = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                leftSymbol.push(c);
            } else if (c == ')' && !leftSymbol.isEmpty() && leftSymbol.peek() == '(') {
                leftSymbol.pop();
            } else if (c == '}' && !leftSymbol.isEmpty() && leftSymbol.peek() == '{') {
                leftSymbol.pop();
            }else if (c == ']' && !leftSymbol.isEmpty() && leftSymbol.peek() == '[') {
                leftSymbol.pop();
            }else {
                return false;
            }
        }
        return leftSymbol.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(validParentheses(s));
    }
}
