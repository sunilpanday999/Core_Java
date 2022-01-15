package CoreJavaPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IndexOfTwoNumAddTarget {
//    public int[] twoSum(int[] numbers, int target) {
//        int [] nums = new int [2];
//        for(int i=0; i<numbers.length-1; i++){
//            for(int j=i+1; j< numbers.length-1; j++){
//                if(target ==(numbers[i]+numbers[j])){
//                    nums[0] = i;
//                    nums[1] = j;
//                }
//            }
//        }
//        return nums;
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {2, 5, 9, 3, 6, 7, 8};
//        int target = 16;
//        IndexOfTwoNumAddTarget index = new IndexOfTwoNumAddTarget();
//        int [] string = index.twoSum(numbers,target);
//        System.out.println(Arrays.toString(string));
//    }

//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int j = 0; j < nums.length; j++) {
//            Integer i = map.get(target - nums[j]);
//            if (i != null) {
//                return new int[]{ i, j };
//            }
//            map.put(nums[j], j);
//        }
//        return new int[]{-1, -1};
//    }
    // 0, 2      1, 5    2, 9       3,3      4,6     5,7     6,8
public int[] twoSum(int[] nums, int target) {
    int[] indices = new int[2];
    for (int i = 0; i < nums.length - 1; i++) {
        for (int j = i + 1; j < nums.length - 1; j++) {
            if (target == (nums[i] + nums[j])) {
                indices[0] = i;
                indices[1] = j;
            }
        }
    }
    return indices;
}
    public static void main(String[] args) {
        int[] numbers = {2, 5, 9, 3, 6, 7, 8};
        int target = 16;
        IndexOfTwoNumAddTarget index = new IndexOfTwoNumAddTarget();
        int [] string = index.twoSum(numbers, target);
        System.out.println(Arrays.toString(string));
    }
}
