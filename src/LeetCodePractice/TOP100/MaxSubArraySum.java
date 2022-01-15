package LeetCodePractice.TOP100;

public class MaxSubArraySum {
    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = Math.max(nums[i], sum+nums[i]);
            result = Math.max(sum, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = new int [] {-1};
        System.out.println(maxSubArray(nums));
    }
}
