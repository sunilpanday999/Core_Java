package CoreJavaPractice;

public class CountTrueFromArray {
    public static int countTrue(boolean[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == true){
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        boolean[] arr = {true, false, true, false, false, true, true};
        System.out.println(countTrue(arr));
    }
}
