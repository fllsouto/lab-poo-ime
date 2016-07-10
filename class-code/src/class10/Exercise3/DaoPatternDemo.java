package class10.Exercise3;

/**
 * Created by fsouto on 02/06/16.
 */
public class DaoPatternDemo {
    public static void main(String[] args){
        String filename = "students.txt";
        String filepath = "src/class10/Exercise3/";
        daoPatternWithFile(filepath, filename);

    }

    public static void daoPatternWithFile(String filepath, String filename) {
        StudentDaoImplFile studentDaoFile = new StudentDaoImplFile(filepath + filename);
        String outputFilename = "students_dao_backup.txt";
        System.out.println("Dao Pattern With File");
        for(Student student : studentDaoFile.getAllStudents()){
            System.out.println("Student: [RollNo: " + student.getRollNo() + ", Name: " + student.getName() + " ]");
        }

        Student student = studentDaoFile.getAllStudents().get(0);
        System.out.println("Name before: " + studentDaoFile.getAllStudents().get(0).getName());
        student.setName("Michael");
        System.out.println("Name after: " + studentDaoFile.getAllStudents().get(0).getName());
        studentDaoFile.updateStudent(student);

        studentDaoFile.getStudent(0);
        System.out.println("Student: [RollNo: " + student.getRollNo() + ", Name: " + student.getName() + " ]");
        studentDaoFile.backupStudentDaoToFile(filepath + outputFilename);
    }

    public static void daoPatternBasic() {
        StudentDao studentDaoBasic = new StudentDaoBasic();

        System.out.println("Dao Pattern Basic");
        for(Student student : studentDaoBasic.getAllStudents()){
            System.out.println(student);
        }

        Student student = studentDaoBasic.getAllStudents().get(0);
        System.out.println("Name before: " + studentDaoBasic.getAllStudents().get(0).getName());
        student.setName("Michael");
        System.out.println("Name after: " + studentDaoBasic.getAllStudents().get(0).getName());
        studentDaoBasic.updateStudent(student);

        studentDaoBasic.getStudent(0);
        System.out.println(student);
    }
}
