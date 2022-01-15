package CoreJavaPractice;

public class FirstCarriageCapacity {
    public static int findSeat(int n, int[] arr) {
        int first_Index = 0;
        for(int i=0; i<arr.length; i++){
            int nums = (n/arr.length)/2;
            if(nums >= arr[i]){
                first_Index = i;
                break;
            } else {
                first_Index = -1;
            }
        }
        return first_Index;
    }

    public static void main(String[] args) {
        int arr[] = {50, 20, 80, 90, 100, 60, 30, 50, 80, 60};
        int n = 1000;
        System.out.println(findSeat(n, arr));
    }
}
