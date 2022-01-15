package Java_8;

import java.util.*;

public class SortedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(1);
        list.add(5);
        /*
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
         */
        list.stream().sorted().forEach(t-> System.out.println(t));

        System.out.println("--------------------------------------");

        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.println(t));


        List<Employee> employees = DataBaseDAO.getEmployees();
        Collections.sort(employees, (o1, o2) -> o2.getSalary() - o1.getSalary());
        System.out.println(employees);

        System.out.println("-------------------------");
        employees.stream().sorted((o1, o2) -> o2.getSalary() - o1.getSalary()).forEach(System.out::println);

        System.out.println("-------------------------");
        employees.stream().sorted(Comparator.comparing(emp -> emp.getName())).forEach(System.out::println);

        System.out.println("-------------------------");
        employees.stream().sorted(Comparator.comparing(Employee::getPosition)).forEach(System.out::println);


    }
}

/*
class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}

 */