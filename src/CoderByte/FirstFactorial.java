package CoderByte;

import java.util.Scanner;

public class FirstFactorial {
    /*
    Have the function FirstFactorial(num) take the num parameter being passed and
    return the factorial of it. For example: if num = 4, then your program should
    return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be between 1 and
    18 and the input will always be an integer.
     */

    public static int FirstFactorial(int num) {
        // code goes here
        int total = 1;
        if (num == 0) return 0;
        while (num > 0 ){
            total *= num;
            num--;
        }
        return total;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }
}
