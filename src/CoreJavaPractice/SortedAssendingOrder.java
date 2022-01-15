package CoreJavaPractice;

public class SortedAssendingOrder {
    public static int[] sortNumsAscending(int[] nums) {
        int [] sortedInt = new int[]{};
        int temp = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return sortedInt;
    }
}
