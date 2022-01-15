package CoderByte;

import java.util.Arrays;
import java.util.Scanner;

public class FindIntersection {

    public static String FindIntersection(String[] strArr) {
        /*
        Have the function FindIntersection(strArr) read the array of strings stored in
        strArr which will contain 2 elements: the first element will represent a list
        of comma-separated numbers sorted in ascending order, the second element will
        represent a second list of comma-separated numbers (also sorted). Your goal is
        to return a comma-separated string containing the numbers that occur in elements
        of strArr in sorted order. If there is no intersection, return the string false.
         */

        String[] arr1 = strArr[0].split(", ");
        String[] arr2 = strArr[1].split(", ");
        String result = "";
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i].equals(arr2[j])){
                    result = result+","+arr1[i];
                    break;
                }
            }
        }

        if(result==""){
            strArr[0] = "false";
        } else{
            strArr[0] = result = result.substring(1, result.length());
        }
        return strArr[0];
    }

    public static void main (String[] args) {
        // keep this function call here
        String [] str = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        System.out.print(FindIntersection(str));
    }

}
//{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"} // 1, 4, 13
//{"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"} // 1, 9, 10
// 1 1 2 3 4 4 7 13 13 15
// 1 1 3 4 9 9 10 10 17 18

