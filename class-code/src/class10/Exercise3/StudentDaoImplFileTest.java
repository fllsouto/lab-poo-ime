package class10.Exercise3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fsouto on 02/06/16.
 */
public class StudentDaoImplFileTest {
    @Test
    public void testCreationFromFile(){
       String filename = "junit_students_test.txt";
       String filepath = "src/class10/Exercise3/";

        StudentDaoImplFile studentDaoFile = new StudentDaoImplFile(filepath + filename);
        Assert.assertEquals(studentDaoFile.getStudent(0).getName(), "Sansa");
        Assert.assertEquals(studentDaoFile.getStudent(3).getName(), "Jon");
        Assert.assertEquals(studentDaoFile.getStudent(1).getRollNo(), 1);
        Student student = new Student("Bran", 3);
        studentDaoFile.updateStudent(student);
        Assert.assertEquals(studentDaoFile.getStudent(3).getName(), "Bran");
    }

}