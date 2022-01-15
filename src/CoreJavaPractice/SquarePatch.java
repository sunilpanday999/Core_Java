package CoreJavaPractice;

import java.util.Arrays;
// [3,3,3   3,3,3    3,3,3]
public class SquarePatch {
    public static int[][] squarePatch(int n) {
        int k = 1;
        int[][] numbers = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                numbers[i][j] = k;
                k++;
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.print(Arrays.toString(squarePatch(n)));

    }
}
