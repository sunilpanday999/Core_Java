package Java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceDemo {
    /*
    @Override
    public void accept(Integer integer) {
        System.out.println("Print : "+ integer);
    }
    */
    public static void main(String[] args) {
        /*
        Consumer<Integer> consumers = i -> System.out.println("Print : "+ i);
        consumers.accept(20);
         */
        //Integer [] arrlist = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().forEach(i -> System.out.println("Print : "+ i));
    }
}
