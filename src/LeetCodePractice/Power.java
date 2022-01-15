package LeetCodePractice;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class Power {
    public static double myPow(double x, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return power(x, n / 2) * power(x, n / 2);
        else
            return x * power(x, n / 2) * power(x, n / 2);

    }

    public static void main(String[] args) {

        System.out.println(myPow(2, -2));


    }
}
