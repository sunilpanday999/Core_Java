package CoreJavaPractice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BasicCalculator {
    public static int calculator(int num1, char operator, int num2){
        int total = 0;
        switch (operator){
            case '+' : total = num1+num2;
                    break;
            case '-' : total = num1-num2;
                    break;
            case '*' : total = num1*num2;
                break;
            case '/' : total = num1/num2;
                break;
            default: total = Integer.parseInt("Error Try Again!!!");
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();
        System.out.println("Enter the operator sign");
        char operator = scan.next().charAt(0);
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();

        System.out.println("Total is : " + calculator(num1, operator, num2));

    }
}
