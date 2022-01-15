package Java_8;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService {
    /*
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
     */
    public List<Student> getStudentSorted(){
        List<Student> students = new StudentDAO().getStudents();
        Collections.sort(students, (o1, o2) -> o2.getName().compareTo(o1.getName()));
        return students;
    }

    public static void main(String[] args) {
        System.out.println(new StudentService().getStudentSorted());
    }

}

/*
class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
*/