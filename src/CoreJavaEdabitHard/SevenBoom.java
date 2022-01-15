package CoreJavaEdabitHard;

public class SevenBoom {
    public static String sevenBoom(int[] arr) {
        String seven = "";
        for(int i=0; i<arr.length;i++) {
            //return condition ?
            seven = (arr[i] == 7) ? "Boom !!!!!!!!!!" : "There is no 7 in the array";
        }
        return seven;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sevenBoom(arr));
    }
}
