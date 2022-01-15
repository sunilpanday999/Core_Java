package CoreJavaPractice;

import java.util.Arrays;

public class PhoneNumberFormat {
    public static String formatPhoneNumber(int[] nums) {
        //"(123) 456-7890
        String phoneNumber ="";
        for(int i=0; i<nums.length; i++){
            if(nums.length == 10){
               if(i==0){
                   phoneNumber += "(";
               } else if ( i == 3) {
                   phoneNumber += ") ";
               } else if ( i== 6){
                   phoneNumber += "-";
               }
               phoneNumber += nums[i];
            }
            else{
                phoneNumber = "No enough Number";
            }
        }
        return phoneNumber;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(formatPhoneNumber(nums));
    }
}
