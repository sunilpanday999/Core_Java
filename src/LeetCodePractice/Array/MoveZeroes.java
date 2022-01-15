package LeetCodePractice.Array;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = 0;
        while(i<nums.length && j < nums.length){
            if(nums[j] != 0){
                nums[i] = nums[j];
                System.out.print(nums[i]+ " ");
                i++;
                j++;
            }else{
                j++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            System.out.print(nums[i] + " ");
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);
    }
}
