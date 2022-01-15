package CoreJavaPractice;

public class NestedArray {
    public static boolean canNest(int[] arr1, int[] arr2) {
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4};
        int [] arr2 = {1, 3};
        System.out.println(canNest(arr1, arr2));
    }
}
