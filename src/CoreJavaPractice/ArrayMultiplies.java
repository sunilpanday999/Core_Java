package CoreJavaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMultiplies {
    public static int[] arrayOfMultiples(int num, int length) {
        int[] total = new int[length];
        for(int i=1; i<=length; i++){
            total = new int[]{num * i};
        }
        return total;
    }

    public static void main(String[] args) {
        int num = 5;
        int length = 10;
        System.out.println(Arrays.toString(arrayOfMultiples(num, length)));

    }
}
