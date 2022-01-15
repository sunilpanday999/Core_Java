package LeetCodePractice.TOP100;

public class MajorityElements {

    public static int majorityElements(int [] nums){
        int majorElem = nums.length/2;
        for(int num : nums){
            int count = 0;
            for(int element : nums){
                if(element == num) {
                    count++;
                }
            }
            if(count > majorElem){
                return num;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,1,1,1,2,2};
        System.out.println(majorityElements(nums));
    }
}
