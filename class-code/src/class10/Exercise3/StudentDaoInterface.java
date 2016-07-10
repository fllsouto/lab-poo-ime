package class10.Exercise3;

import java.util.List;

/**
 * Created by fsouto on 02/06/16.
 */
public interface StudentDaoInterface {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
