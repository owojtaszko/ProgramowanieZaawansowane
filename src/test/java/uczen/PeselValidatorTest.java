package uczen;

import org.junit.Test;
import uczen.PeselValidator;

import static org.junit.Assert.*;

public class PeselValidatorTest {
    @Test
    public void testPeselNull(){
        //given
        String pesel = null;
        PeselValidator peselValidator = new PeselValidator();
        //when
        boolean result = peselValidator.validate(pesel);

        //then
        assertFalse(result);
    }
    @Test
    public void testPeselLengthShorter(){
        //given
        String pesel = "345435";
        PeselValidator peselValidator = new PeselValidator();
        //when
        boolean result = peselValidator.validate(pesel);
        //then
        assertFalse(result);
    }
    @Test
    public void testPeselLengthLonger(){
        //given
        String pesel = "3454356546545645";
        PeselValidator peselValidator = new PeselValidator();
        //when
        boolean result = peselValidator.validate(pesel);
        //then
        assertFalse(result);
    }
    @Test
    public void testPeselLengthCorect(){
        //given
        String pesel = "88070103029";
        PeselValidator peselValidator = new PeselValidator();
        //when
        boolean result = peselValidator.validate(pesel);
        //then
        assertTrue(result);
    }

    @Test
    public void testPeselWhithLeter(){
        //given
        String pesel = "8807010302w";
        PeselValidator peselValidator = new PeselValidator();
        //when
        boolean result = peselValidator.validate(pesel);
        //then
        assertFalse(result);
    }

    @Test
    public void testPeselWhithSpecialChar(){
        //given
        String pesel = "8807010302$";
        PeselValidator peselValidator = new PeselValidator();
        //when
        boolean result = peselValidator.validate(pesel);
        //then
        assertFalse(result);
    }
    @Test
    public void testPeselWhithEmptyChar(){
        //given
        String pesel = "8807010302 ";
        PeselValidator peselValidator = new PeselValidator();
        //when
        boolean result = peselValidator.validate(pesel);
        //then
        assertFalse(result);
    }

}