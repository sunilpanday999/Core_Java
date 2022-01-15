package LeetCodePractice.TOP100;

public class MultipleStrings {
    public static String multiply(String num1, String num2) {
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);

        long multi = n1 * n2;
        return (String.valueOf(multi));
    }

    public static void main(String[] args) {
        System.out.println(multiply("123456789", "987654321"));
    }
}
