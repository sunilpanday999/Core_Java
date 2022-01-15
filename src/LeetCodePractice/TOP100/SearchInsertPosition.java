package LeetCodePractice.TOP100;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        if(nums.length == 0 || target == 0) return 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                index = i;

            }
            if(nums[i] < target){
                index = i+1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int [] nums = {1, 3, 5, 7};
        int target = 6;
        System.out.println(searchInsert(nums, target));
    }
}
