package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionalInterfaceDemo  {
    /*
    @Override
    public String get() {
        return "Hi Sunil, Welcome to JAVA 8 function";
    }
     */

    public static void main(String[] args) {
        /*
        Supplier<String> supplier = () -> "Hi Sunil, Welcome to JAVA 8 function";
        System.out.println(supplier.get());

         */

        List<String> list = Arrays.asList("Sunil", "Ranju");
        System.out.println(list.stream().findAny().orElseGet(() -> "Hi Sunil, Welcome to JAVA 8 function"));

    }
}
