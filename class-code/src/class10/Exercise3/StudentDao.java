package class10.Exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fsouto on 02/06/16.
 */
public class StudentDao implements StudentDaoInterface {
    List<Student> students;

    public StudentDao(){ super(); }
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted");
    }

    public int studentsQuantity(){ return this.students.size(); }
}
