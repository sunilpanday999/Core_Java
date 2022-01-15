package Java_8;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public List<Student> getStudents (){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Sunil", 30));
        studentList.add(new Student(2, "Ranju", 26));
        studentList.add(new Student(3, "Lax", 26));
        studentList.add(new Student(4, "Samel", 23));
        return studentList;


    }
}
