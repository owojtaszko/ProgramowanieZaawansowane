package uczen;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchoolStudentTest {

    @Test
    public void testSchoolStudent() {
        // given
        SchoolStudent givenSchoolStudent = new SchoolStudent();
        // when
        givenSchoolStudent.setSchoolName("Staszic");
        givenSchoolStudent.setName("Jan");
        givenSchoolStudent.setSurname("Kowalski");
        givenSchoolStudent.setPesel("02070803628");
        // then
        assertEquals("Jan", givenSchoolStudent.getName());
        assertEquals("Staszic", givenSchoolStudent.getSchoolName());
        assertEquals("Kowalski", givenSchoolStudent.getSurname());
        assertEquals("02070803628", givenSchoolStudent.getPesel());
    }

    @Test
    public void testConstructor() {
        //given
        Student student = new Student("Jan", "Kowalski", "02070803628");
        SchoolStudent givenSchoolStudent = new SchoolStudent("Staszic", student);


        //when

        //then
        assertEquals("Jan", givenSchoolStudent.getName());
        assertEquals("Kowalski", givenSchoolStudent.getSurname());
        assertEquals("02070803628", givenSchoolStudent.getPesel());
        assertEquals("Staszic", givenSchoolStudent.getSchoolName());

    }

    @Test
    public void testConstructor2() {
        //given
        Student student = new Student("Jan", "Kowalski", "02070803628");
        SchoolStudent givenSchoolStudent = new SchoolStudent("Staszic", student);
        SchoolStudent givenSchoolStudent2 = new SchoolStudent(givenSchoolStudent);
        //when
        //then
        assertEquals("Jan", givenSchoolStudent2.getName());
        assertEquals("Kowalski", givenSchoolStudent2.getSurname());
        assertEquals("02070803628", givenSchoolStudent2.getPesel());
        assertEquals("Staszic", givenSchoolStudent2.getSchoolName());

    }

}