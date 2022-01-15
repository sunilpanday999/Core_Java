package Java_8;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTaxService {

    public static List<Employee> evaluateTaxUsers(String input){
        return (input.equalsIgnoreCase("tax"))?
             DataBaseDAO.getEmployees().stream().filter(emp -> emp.getSalary() > 40000).collect(Collectors.toList()):
             DataBaseDAO.getEmployees().stream().filter(emp -> emp.getSalary() < 40000).collect(Collectors.toList());

        }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("non tax"));
    }
}
