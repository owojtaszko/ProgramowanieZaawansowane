package telefon;

import org.junit.Test;
import static org.junit.Assert.*;
public class NrTelefonicznyTest {
    @Test
    public void nrTelefonicznyTest() {
        //given
        NrTelefoniczny nrTelefoniczny = new NrTelefoniczny("081", "506602642");
        //when
        //then
        assertEquals("081", nrTelefoniczny.getNrKierunkowy());
        assertEquals("506602642", nrTelefoniczny.getNrTelefonu());
    }
}