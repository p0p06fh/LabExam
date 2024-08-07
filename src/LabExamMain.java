import Student.Student;
import Student.StudentFactory;

import java.util.ArrayList;
import java.util.List;

public class LabExamMain {
    public static void main(String[] args) {
        // Make multiple Students of Each Type using Factory
        Student s1 = StudentFactory.createStudent("FULLTIME", 1, "Alice", 55.0);
        Student s2 = StudentFactory.createStudent("FULLTIME", 2, "Bob", 45.0);
        Student s3 = StudentFactory.createStudent("FULLTIME", 3, "Charlie", 60.0);

        // Store Students in a Collection
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // Iterate through Collection and print Students with GPA above 50%
        for (Student student : students) {
            if (student.getGPA() > 50) {
                System.out.println(student);
            }
        }
    }
}
