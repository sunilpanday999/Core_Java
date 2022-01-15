package LeetCodePractice.TOP100;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int single_num = 0;
        int x = 5;
        for(int i=0; i<nums.length; i++){
            single_num ^= nums[i];
        }
        x = 4 ^ 3;
        System.out.println(x);
        return single_num;
    }

    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
