package CoreJavaPractice;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int num = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(target == (nums[i]+nums[j]+nums[k])){
                        num = target + 1;
                    }
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int [] nums = {-1,2,1,-4};
        int target = 1;
        ThreeSumClosest sum = new ThreeSumClosest();
        System.out.println(sum.threeSumClosest(nums, target));

    }
}
