import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();
        CollegeStudent collegeStudent = new CollegeStudent("a", "b", "email");
        SchoolStudent schoolStudent = new SchoolStudent("c", "d", "emailadd");

        students.add(collegeStudent);
        students.add( new SchoolStudentAdapter(schoolStudent));

        return students;
    }
}
