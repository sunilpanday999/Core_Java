package LeetCodePractice;

public class MaximumSumofSubArray {

    public static int maxSubArray(int[] nums) {
        int size = nums.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + nums[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
        /* Driver program to test maxSubArraySum */
        public static void main(String[] args)
        {
            int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
            int max_sum = maxSubArray(a);
            System.out.println("Maximum contiguous sum is "
                    + max_sum);
        }

}
