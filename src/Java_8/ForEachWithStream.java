package Java_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachWithStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sunil");
        list.add("Ranju");
        list.add("Lax");
        list.add("Samel");
        list.add("Gopal");

        // traditional way
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        // Using Consumer Function Interface
        list.stream().forEach(t-> System.out.println(t));

        System.out.println("--------------------------------");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sunil");
        map.put(2, "Ranju");
        map.put(3, "Lax");
        map.put(4, "Samel");
        map.put(5, "Gopal");

        //normal way
        map.forEach((key, value)-> System.out.println(key + " = " + value));

        System.out.println("--------------------------------");

        //changing map to stream and print in foreach
        map.entrySet().stream().forEach((obj) -> System.out.println(obj));

    }
}
