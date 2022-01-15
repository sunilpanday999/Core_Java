package CoreJavaPractice;

public class RemoveDuplicateOfSortedArrays {

    public static int removeDuplicates(int[] nums) {

        int[] temp = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[count++] = nums[i];
            }
        }
        temp[count++] = nums[nums.length - 1];
        for (int i = 0; i < count; i++) {
            nums[i] = temp[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }
}
