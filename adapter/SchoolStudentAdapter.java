public class SchoolStudentAdapter implements Student{

    private SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent = schoolStudent;
    }
    @Override
    public String getName() {
        return this.schoolStudent.getFirstname();
    }

    @Override
    public String getSurname() {
        return this.schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return this.schoolStudent.getEmailAddress();
    }
}
