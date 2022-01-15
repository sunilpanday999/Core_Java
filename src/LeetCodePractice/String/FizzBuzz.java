package LeetCodePractice.String;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();

        for(int i=1; i<=n; i++){

            boolean divisionBy3 = (i%3==0);
            boolean divisionBy5 = (i%5==0);

            if(divisionBy3 && divisionBy5){
                list.add("FizzBuzz");
            }
            else if(divisionBy3){
                list.add("Fizz");
            } else if(divisionBy5){
                list.add("Buzz");
            } else{
                list.add(String.valueOf(i));
            }
        }
        return list;
//        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//        answer[i] == "Fizz" if i is divisible by 3.
//        answer[i] == "Buzz" if i is divisible by 5.
//        answer[i] == i (as a string) if none of the above conditions are true.
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fizzBuzz(n));

        int i= 0;
        String n1 = String.valueOf(i);
        System.out.println(n1);
    }
}
