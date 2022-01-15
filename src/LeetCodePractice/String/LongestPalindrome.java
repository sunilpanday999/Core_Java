package LeetCodePractice.String;

public class LongestPalindrome {
    public static int longestPalindrome(String s){
        /*
        if(s.length() == 0 )return 0;

        int[] count = new int[128];
        for(char c : s.toCharArray()){
            count[c]++;
        }
        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;

         */

        if(s.length()== 0) return 0;

        int [] count = new int[128];
        for(char c : s.toCharArray()){
            count[c]++;
        }
        int ans = 0;
        for(int v : count){
            ans += v / 2 * 2;
            if(ans % 2 ==0 && v % 2 == 1)
                ans ++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
