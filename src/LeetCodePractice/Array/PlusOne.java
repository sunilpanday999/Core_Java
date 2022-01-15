package LeetCodePractice.Array;

import java.util.Arrays;

public class PlusOne {
    public static int [] plusOne(int [] digits) {

//        for(int i=digits.length-1; i>=0; i--) {
//            if (digits[i] != 9) {
//                digits[i] = digits[i] + 1;
//                return digits;
//            } else if (i == 0) {
//                int[] ans = new int [digits.length + 1];
//                digits[i] = 0;
//                ans[0] = 1;
//                for(int m=0; m<digits.length; m++){
//                    ans[i+1] = digits[i];
//                }
//                return ans;
//            }
//            else{
//                digits[i] = 0;
//            }
//        }
//        return digits;

        for(int i = digits.length -1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            else if(i == 0){
                int [] ans = new int [digits.length +1];
                digits[i] = 0;
                ans[0] = 1;
//                for(int j=0; j< ans.length; j++){
//                    ans[i+1] = digits[i];
//                }
                return ans;
            } else{
                digits[i] = 0;
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
