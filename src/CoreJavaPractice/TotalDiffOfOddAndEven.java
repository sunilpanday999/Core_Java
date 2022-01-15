package CoreJavaPractice;

public class TotalDiffOfOddAndEven {

    public static int warOfNumbers(int[]numbers){
        int odd = 0;
        int even = 0;
        for(int i =0; i<numbers.length; i++){
//            name = ((city.getName() == null) ? "N/A" : city.getName());
//            odd = (numbers[i]%2 == 1) ? odd= odd+ numbers[i] : even+=numbers[i];
            if(numbers[i]%2==1) {
                odd += numbers[i];
            }
            else{
                even += numbers[i];
            }
        }
        return Math.abs(even-odd);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 9, 5, 6};
        System.out.println(warOfNumbers(numbers));
    }
}
