package Java_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {
    public static void main(String[] args) {
        //fiter will used to check the condition and only use in predicate
        List<String> list = new ArrayList<>();
        list.add("Sunil");
        list.add("Ranju");
        list.add("Lax");
        list.add("Samel");
        list.add("Gopal");

        list.stream().filter(t->t.startsWith("S")).forEach(t-> System.out.println(t));

        System.out.println("--------------------------------");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sunil");
        map.put(2, "Ranju");
        map.put(3, "Lax");
        map.put(4, "Samel");
        map.put(5, "Gopal");
        map.entrySet().stream().filter(key->key.getKey()%2==0).forEach(t-> System.out.println(t));
    }
}
