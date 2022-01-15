package CoreJavaPractice;

public class LargerOrEqaulNumber {
    public static boolean existsHigher(int[] arr, int n) {
        boolean flag = false;
        for(int i=0; i <arr.length; i++){
            if(arr[i] >= n){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int [] arr = {5, 3, 15, 22, 4};
        int n = 10;
//        existsHigher([1, 2, 3, 4, 5], 8) ➞ false
//
//        existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true
        System.out.println(existsHigher(arr,n));
    }
}
