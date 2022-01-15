package CoreJavaPractice;

public class OperatorFunctions {
    public static int operate(int a, int b, String op) {
        int nums = 0;
        switch (op){
            case "+":
                nums = a+b;
                break;
            case "-":
                nums = a-b;
                break;
            case "*":
                nums = a*b;
                break;
            case "/":
                nums = a/b;
                break;
            case "%":
                nums = a%b;
                break;
            default:
                nums = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(operate(4,2,"S"));
    }
}
