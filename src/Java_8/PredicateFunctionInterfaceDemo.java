package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionInterfaceDemo {
    /*
    @Override
    public boolean test(Integer t) {
        if(t%2 ==0){
            return true;
        }
        return false;
    }
     */

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(t -> t%2 ==0).forEach(i -> System.out.println("Even : "+ i));
        list.stream().filter(t -> t%2 ==1).forEach(i -> System.out.println("Odd : "+ i));
    }
}
