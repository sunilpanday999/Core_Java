package LeetCodePractice.String;

public class SumOfBinaryNumbers {

    public static String addBinary(String a, String b){

        int num1 = Integer.parseInt(a, 2);
        System.out.println(num1);
        int num2 = Integer.parseInt(b, 2);
        System.out.println(num2);
        int sum = num1 + num2;

        return Integer.toBinaryString(sum);
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }
}
