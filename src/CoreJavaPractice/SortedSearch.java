package CoreJavaPractice;

import java.util.Arrays;

public class SortedSearch {

    public static int countNumbers(int[] sortedArray, int lessThan) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        Arrays.sort(sortedArray);
        int count = 0;
        for(int i=0; i<sortedArray.length; i++){
            if(lessThan < sortedArray[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}
