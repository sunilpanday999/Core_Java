package CoreJavaPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MedianOfTwoSortedArrays {
    public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double [] merged_Array = new double [m + n];
        int count=0;
        for(int i=0; i<m; i++){
            merged_Array[i] = nums1[i];
            count++;
        }
        for(int j=0; j< n; j++){
            merged_Array[count++] = nums2[j];
        }
        double total = 0;
        for(int i=0; i<merged_Array.length; i++){
            total += merged_Array[i];
        }
        return total/merged_Array.length;

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4, 5};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
