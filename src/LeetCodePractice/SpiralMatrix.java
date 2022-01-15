package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
//    public static List<Integer> spiralOrder(int[][] matrix) {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix.length; j++){
                list.add(matrix[i][j]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}
