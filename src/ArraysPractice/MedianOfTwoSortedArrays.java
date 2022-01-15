package ArraysPractice;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count = 0;
        double[] merged_Arr = new double[nums1.length + nums2.length];
        for(int i=0; i< nums1.length; i++){
            merged_Arr[i] = nums1[i];
            count++;
        }
        for(int j=0; j<nums2.length; j++){
            merged_Arr[count++] = nums2[j];
        }
        Arrays.sort(merged_Arr);
        double total = 0;
        for(int i=0; i<merged_Arr.length; i++){
            total += merged_Arr[i];
        }
        double median = total/merged_Arr.length;
        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

}
