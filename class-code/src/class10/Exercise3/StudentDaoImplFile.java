package class10.Exercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fsouto on 02/06/16.
 */
public class StudentDaoImplFile extends StudentDao {

    public StudentDaoImplFile(String filename) {
        super();
        System.err.println("StudentDaoImplFile initialize");
        try {
            students = new ArrayList<Student>();
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = null;
            while((line = br.readLine()) != null) {
                Student student = new Student(line, students.size());
                students.add(student);
            }
        } catch (IOException e) {
            System.err.println("Error while creating student list!");
            e.printStackTrace();
        }

    }

    public boolean backupStudentDaoToFile(String filename){
        String encoding = "UTF-8";
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(filename, encoding);
            for(Student student: this.getAllStudents()) {
                writer.println(student);
            }
            writer.close();
            return true;
        } catch (IOException e) {
            System.err.println("Error while backup student list!");
            e.printStackTrace();
            return false;
        }
    }
}
