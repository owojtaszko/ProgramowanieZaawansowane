package telefon;
import org.junit.Test;

import static org.junit.Assert.*;

public class OsobaTest {

    @Test
    public void testOpis() {
        Osoba osoba = new Osoba();
        assertEquals("Dane kontaktowe osoby niebędącej firmą", osoba.opis());
    }

    @Test
    public void testOsoba() {
        //given
        NrTelefoniczny nrTelefoniczny = new NrTelefoniczny("081", "506602642");
        Osoba osoba = new Osoba("Jan", "Kowalski", "ul. Morwowa2, Lublin", nrTelefoniczny);

        //when
        //then
        assertEquals("Jan", osoba.getImie());
        assertEquals("Kowalski", osoba.getNazwisko());
        assertEquals("ul. Morwowa2, Lublin", osoba.getAdres());
        assertEquals(nrTelefoniczny, osoba.getNrTelefonu());
    }

}