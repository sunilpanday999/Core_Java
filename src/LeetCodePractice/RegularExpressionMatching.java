package LeetCodePractice;

public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        /*
        if(p.isEmpty()) return s.isEmpty();
        boolean first_match = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
//        System.out.println(first_match);
        if (p.length() >= 2 && p.charAt(1) == '*'){
            return (isMatch(s, p.substring(2)) || (first_match && isMatch(s.substring(1), p)));
        } else {
            return first_match && isMatch(s.substring(1), p.substring(1));
        }
    }
    */


        int rows = s.length();
        int columns = p.length();
        /// Base conditions
        if (rows == 0 && columns == 0) {
            return true;
        }
        if (columns == 0) {
            return false;
        }
        // DP array
        boolean[][] dp = new boolean[rows + 1][columns + 1];
        // Empty string and empty pattern are a match
        dp[0][0] = true;
        // Deals with patterns with *
        for (int i = 2; i < columns + 1; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = dp[0][i - 2];
            }
        }
        // For remaining characters
        for (int i = 1; i < rows + 1; i++) {
            for (int j = 1; j < columns + 1; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (j > 1 && p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        dp[i][j] = dp[i][j] | dp[i - 1][j];
                    }
                }
            }
        }
        return dp[rows][columns];
    }
    public static void main(String[] args) {
        String s = "ab", p = ".*";
        System.out.println(isMatch(s, p));
    }
}
