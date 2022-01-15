package CoreJavaEdabitHard;

import java.util.Arrays;
import java.util.Collections;

public class ConsecutiveNumbers {
    public static boolean cons(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] < arr[i+1]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int [] arr = {5, 1, 4, 9, 2};
        System.out.println(cons(arr));

    }
}
//    cons([5, 1, 4, 3, 2]) ➞ true
// Can be re-arranged to form [1, 2, 3, 4, 5]

//        cons([5, 1, 4, 3, 2, 8]) ➞ false

//        cons([5, 6, 7, 8, 9, 9]) ➞ false
// 9 appears twice
