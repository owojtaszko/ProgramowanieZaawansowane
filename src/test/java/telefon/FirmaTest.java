package telefon;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirmaTest {

    @Test
    public void testOpis() {
        Firma firma = new Firma();

        assertEquals("Dane kontaktowe firmy", firma.opis());
    }

    @Test
    public void testFirma() {
        //given
        NrTelefoniczny nrTelefoniczny = new NrTelefoniczny("081", "506602642");
        Firma firma = new Firma("SDA", "al.Racławickie 8, Lublin", nrTelefoniczny);

        //when
        //then
        assertEquals("SDA", firma.getNazwaFirmy());
        assertEquals("al.Racławickie 8, Lublin", firma.getAdresFirmy());
        assertEquals(nrTelefoniczny, firma.getNrTelefonu());

    }

}