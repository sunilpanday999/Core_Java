package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduce {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 8 ,9, 10, 23, 5, 9);

        int sum = list.stream().mapToInt(i -> i).sum();
        System.out.println("Total of list is: " +sum);

        Integer reduceSum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSum1 = list.stream().reduce(Integer::sum);
        System.out.println(reduceSum1.get());


        Integer reduceMultiple = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduceMultiple);


    }
}
