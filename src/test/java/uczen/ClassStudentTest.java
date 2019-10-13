package uczen;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassStudentTest {

    @Test
    public void ClassStudent() {
        // given
        ClassStudent givenClassStudent = new ClassStudent();
        // when
        givenClassStudent.setSchoolName("Staszic");
        givenClassStudent.setName("Jan");
        givenClassStudent.setSurname("Kowalski");
        givenClassStudent.setPesel("02070803628");
        givenClassStudent.setClassNr(3);
        // then
        assertEquals("Jan", givenClassStudent.getName());
        assertEquals("Staszic", givenClassStudent.getSchoolName());
        assertEquals("Kowalski", givenClassStudent.getSurname());
        assertEquals("02070803628", givenClassStudent.getPesel());
        assertEquals(3, givenClassStudent.getClassNr());
    }

    @Test
    public void testConstructor1() {
        //given
        SchoolStudent schoolStudent = new SchoolStudent();
        schoolStudent.setName("Jan");
        schoolStudent.setSurname("Kowalski");
        schoolStudent.setPesel("02070803628");
        schoolStudent.setSchoolName("Staszic");
        ClassStudent classStudent = new ClassStudent(3, schoolStudent);
        //when
        //then
        assertEquals("Jan", classStudent.getName());
        assertEquals("Kowalski", classStudent.getSurname());
        assertEquals("02070803628", classStudent.getPesel());
        assertEquals("Staszic", classStudent.getSchoolName());
        assertEquals(3, classStudent.getClassNr());
    }
}