package CoreJavaPractice;

public class SumOfArrays {
    public static int sum(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 6, 7, 9};
        System.out.println(sum(arr));
    }
}
