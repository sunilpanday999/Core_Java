package LeetCodePractice.String;

import com.sun.org.apache.xpath.internal.operations.String;

public class NumberComplement {
    public static int findComplement(int num){
        int mask = 1;
        int t = num;
        while(t > 0){
            mask <<=1;

            t >>= 1;
        }
        return num ^ (mask - 1);
    }

    public static void main(String[] args) {
        int num = 5;

        System.out.println(findComplement(num));

    }
}
