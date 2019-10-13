import org.junit.Test;

import static org.junit.Assert.*;

public class UtworTest {
    @Test
    public void testConstruktor(){
        //given
        Utwor utwor = new Utwor("Baranek", "Kult", 3.4);
        //when
        String autor = utwor.getAuthor();

    }

}