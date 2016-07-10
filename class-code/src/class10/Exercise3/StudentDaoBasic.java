package class10.Exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fsouto on 02/06/16.
 */
public class StudentDaoBasic extends StudentDao {

    public StudentDaoBasic(){
        super();
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("John", 1);
        students.add(student1);
        students.add(student2);
    }
}
