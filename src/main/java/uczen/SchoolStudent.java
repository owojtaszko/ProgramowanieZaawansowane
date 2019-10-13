package uczen;

public class SchoolStudent extends Student {

    private String schoolName;

    public SchoolStudent() {
    }

    public SchoolStudent(String schoolName, Student student) {
        this.schoolName = schoolName;
        this.name = student.getName();
        this.surname = student.getSurname();
        this.pesel = student.getPesel();
    }

    public SchoolStudent(SchoolStudent schoolStudent) {
        this.schoolName = schoolStudent.getSchoolName();
        this.name = schoolStudent.getName();
        this.surname = schoolStudent.getSurname();
        this.pesel = schoolStudent.getPesel();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}