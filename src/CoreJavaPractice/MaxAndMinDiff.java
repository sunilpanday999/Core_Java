package CoreJavaPractice;

public class MaxAndMinDiff {

    public static int differenceMaxMin(int[] arr) {
        int max = 0;
        int min = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    max = arr[i];
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    min = arr[i];
                }
            }
        }

        return max - min;

    }

    public static void main(String[] args) {
        int[] arr = {44, 32, 86, 19};
        System.out.println(differenceMaxMin(arr));
    }
}
