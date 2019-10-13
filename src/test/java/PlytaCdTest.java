import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PlytaCdTest {
    @Test
    public void testConstructor() {
        //given
        List<Utwor> inPutUtwor = new ArrayList<Utwor>();
        PlytaCd plytaCd = new PlytaCd("Tata Kazika", "1993", inPutUtwor);

        //when
        List<Utwor> resultUtwory = plytaCd.getUtwory();

        //then
        assertEquals(inPutUtwor, resultUtwory);
    }

    @Test
    public void testSearch() {
        //given
        List<Utwor> inPutUtwor = new ArrayList<Utwor>();
        inPutUtwor.add(new Utwor("Dziewczyna bez zęba na przedzie", "Kazik", 3.20));
        inPutUtwor.add((new Utwor("Maciek ja tylko żartowałem", "Kazik", 4.30)));
        inPutUtwor.add((new Utwor("Baranek", "Kazik", 3.22)));
        PlytaCd plytaCd = new PlytaCd("Tata Kazika", "1993", inPutUtwor);

        //when
        Utwor znalezionyUtwor = plytaCd.search("Maciek ja tylko żartowałem");

        //then
        assertEquals("Kazik", znalezionyUtwor.getAuthor());
        assertEquals("Maciek ja tylko żartowałem", znalezionyUtwor.getTitle());
    }

    @Test
    public void testSearchNotFound() {
        //given
        List<Utwor> inPutUtwor = new ArrayList<Utwor>();
        inPutUtwor.add(new Utwor("Dziewczyna bez zęba na przedzie", "Kazik", 3.20));
        inPutUtwor.add((new Utwor("Maciek ja tylko żartowałem", "Kazik", 4.30)));
        inPutUtwor.add((new Utwor("Baranek", "Kazik", 3.22)));
        PlytaCd plytaCd = new PlytaCd("Tata Kazika", "1993", inPutUtwor);

        //when
        Utwor znalezionyUtwor = plytaCd.search("Celina");

        //then
        assertNull(znalezionyUtwor);
    }

    @Test
    public void testSearchNull() {
        //given
        List<Utwor> inPutUtwor = new ArrayList<Utwor>();
        inPutUtwor.add(new Utwor("Dziewczyna bez zęba na przedzie", "Kazik", 3.20));
        inPutUtwor.add((new Utwor("Maciek ja tylko żartowałem", "Kazik", 4.30)));
        inPutUtwor.add((new Utwor("Baranek", "Kazik", 3.22)));
        PlytaCd plytaCd = new PlytaCd("Tata Kazika", "1993", inPutUtwor);

        //when
        Utwor znalezionyUtwor = plytaCd.search(null);

        //then
        assertNull(znalezionyUtwor);
    }
}