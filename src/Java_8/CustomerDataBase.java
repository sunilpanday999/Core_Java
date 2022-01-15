package Java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDataBase {

    public static List<Customers> getCustomerDetatils(){
        return Stream.of(
        new Customers("Sunil", 101, "sunil@gmail.com", Arrays.asList("8948384828", "8238348348")),
        new Customers("Ranju", 103, "ranju@gmail.com", Arrays.asList("9281948402", "928139434", "9876543234")),
        new Customers("Lax", 102, "lax@gmail.com", Arrays.asList("7689876543"))).collect(Collectors.toList());

    }
}
