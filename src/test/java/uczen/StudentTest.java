package uczen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StudentTest {

    @Test
    public void testConstructor() {
        //given
        Student currentStudent = new Student();

        //when
        currentStudent.setName("Witek");
        currentStudent.setSurname("Pazio");
        currentStudent.setPesel("02070803628");

        //then
        assertEquals("Witek", currentStudent.getName());
        assertEquals("Pazio", currentStudent.getSurname());
        assertEquals("02070803628", currentStudent.getPesel());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorValid() {
        //given
        Student currentStudent = new Student();

        //when
        currentStudent.setName("Witek");
        currentStudent.setSurname("Pazio");
        currentStudent.setPesel("02070803624");

        //then
        assertFalse(true);
    }

    @Test
    public void testConstructorStudent() {
        //given
        Student givenStudent = new Student("Jan", "Kowalski", "02070803628");
        //when
        //then
        assertEquals("Jan", givenStudent.getName());
        assertEquals("Kowalski", givenStudent.getSurname());
        assertEquals("02070803628", givenStudent.getPesel());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorStudentFailed() {
        //given
        Student givenStudent = new Student("Jan", "Kowalski", "02070803624");
        //when
        //then
    }

}