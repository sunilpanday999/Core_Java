package Java_8;

import java.util.*;

public class MapSortedDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sunil", 3);
        map.put("Ranju", 5);
        map.put("Lax", 2);
        map.put("Samel", 4);
        map.put("Bryan", 6);
        map.put("Avi", 1);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, ((o1, o2) -> o1.getValue().compareTo(o2.getValue())));
        System.out.println(entries);


        System.out.println("------------------------------------");
        map.entrySet().stream().sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey())).forEach(System.out::println);

        System.out.println("------------------------------------");
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(System.out::println);

        //method caomparingByKey
        //method comparingByValue
        System.out.println("------------------------------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("------------------------------------");


        Map<Employee, Integer> mapList = new TreeMap<Employee, Integer>((o1, o2) -> o1.getSalary()- o2.getSalary());
        mapList.put(new Employee(101, "Sunil", "Engineer", 60000), 20);
        mapList.put(new Employee(105, "Ranju", "Associate", 25000), 70);
        mapList.put(new Employee(103, "Lax", "Dep Manager", 45000), 40);
        mapList.put(new Employee(106, "Gop", "Ass Manager", 40000), 60);
        mapList.put(new Employee(108, "Samel", "Store Manager", 50000), 30);

        mapList.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);



    }
}
