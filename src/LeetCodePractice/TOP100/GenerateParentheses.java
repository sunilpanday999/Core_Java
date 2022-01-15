package LeetCodePractice.TOP100;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        genParent(list, "", 0, 0, n);
        return list;
    }

    private static void genParent(List<String> result, String s, int open, int close, int n){
        if (open == n && close == n){
            result.add(s);
            return;
        }
        if(open < n){
            genParent(result, s+ "(", open+1, close, n);
        }
        if(close < open){
            genParent(result, s+ ")", open, close+1, n);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
