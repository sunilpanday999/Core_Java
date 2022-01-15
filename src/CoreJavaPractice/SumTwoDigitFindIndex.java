package CoreJavaPractice;

import java.util.Arrays;

public class SumTwoDigitFindIndex {

    public static int[] sumTwo (int [] nums, int target){
        int[] indices = new int [2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(target== (nums[i]+nums[j])){
                    indices = new int[] { i, j };
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 22;
        int [] indecis = sumTwo(nums, target);
        System.out.println(Arrays.toString(indecis));
    }
}
