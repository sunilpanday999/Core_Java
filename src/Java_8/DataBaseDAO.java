package Java_8;

import java.util.ArrayList;
import java.util.List;

public class DataBaseDAO {

    public static List<Employee> getEmployees () {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Sunil", "Engineer", 60000));
        employeeList.add(new Employee(105, "Ranju", "Associate", 25000));
        employeeList.add(new Employee(103, "Lax", "Dep Manager", 45000));
        employeeList.add(new Employee(106, "Gop", "Ass Manager", 40000));
        employeeList.add(new Employee(108, "Samel", "Store Manager", 50000));
        return employeeList;
    }
}
