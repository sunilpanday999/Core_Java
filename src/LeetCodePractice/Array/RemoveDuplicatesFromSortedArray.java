package LeetCodePractice.Array;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int [] nums){

        if(nums.length == 0) return 0;

        int seqIndex = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[seqIndex]){
                seqIndex++;
                nums[seqIndex] = nums[i];
            }
        }
        return seqIndex + 1;
    }

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
