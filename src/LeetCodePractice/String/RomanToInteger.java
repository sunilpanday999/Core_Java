package LeetCodePractice.String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int convertRomanToInteger(String str){
        int [] nums = new int[str.length()];
        int sum =0;

        for(int i=0; i<str.length(); i++){
            switch(str.charAt(i)){
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                sum -= nums[i];
            }
            else {
                sum += nums[i];
            }
        }
        return sum + nums[nums.length -1 ];
    }



    public static void main(String[] args) {
        String s = "VIII";
        System.out.println(convertRomanToInteger(s));
    }
}
