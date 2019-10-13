package wypozyczalnia;

import org.junit.Test;
import wypozyczalnia.Biblioteka;
import wypozyczalnia.PlytaCd;
import wypozyczalnia.Utwor;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BibliotekaTest {

    @Test
    public void testAdd() {
        //given
        List<Utwor> listaUtworow = new ArrayList<>();
        listaUtworow.add(new Utwor("Highway to hell", "AC/DC", 1970));
        Biblioteka biblioteka = new Biblioteka();
        PlytaCd plytaCd = new PlytaCd("Back in black", "AC/DC", listaUtworow);

        //when
        biblioteka.addCD(plytaCd);
        List<PlytaCd> listaPlytResult = biblioteka.getListaPlyt();

        //then
        assertEquals(1, listaPlytResult.size());
        biblioteka.popCDName("Back in black");
        listaPlytResult = biblioteka.getListaPlyt();
        assertEquals(0, listaPlytResult.size());
    }

    @Test
    public void testSearch() {
        //given
        List<Utwor> listaUtworow = new ArrayList<>();
        listaUtworow.add(new Utwor("Highway to hell", "AC/DC", 1970));
        Biblioteka biblioteka = new Biblioteka();
        PlytaCd plytaCd = new PlytaCd("Back in black", "AC/DC", listaUtworow);

        //when
        biblioteka.addCD(plytaCd);
        PlytaCd foundCD = biblioteka.search("Back in black");
        PlytaCd foundCD2 = biblioteka.search("Random title");

        //then
        assertNotNull(foundCD);
        assertNull(foundCD2);
    }

    @Test
    public void toStringTest() {
        //given
        List<Utwor> listaUtworow = new ArrayList<>();
        listaUtworow.add(new Utwor("Highway to hell", "AC/DC", 1970));
        listaUtworow.add(new Utwor("Thunder", "AC/DC", 1200));
        listaUtworow.add(new Utwor("randomSong", "AC/DC", 2343));
        Biblioteka biblioteka = new Biblioteka();
        PlytaCd plytaCd = new PlytaCd("Back in black", "AC/DC", listaUtworow);

        //when
        biblioteka.addCD(plytaCd);
        String listedLibrary = biblioteka.toString();

        //then
        assertEquals("Back in black AC/DC \n" +
                "Highway to hell AC/DC 1970.0\n" +
                "Thunder AC/DC 1200.0\n" +
                "randomSong AC/DC 2343.0", listedLibrary);

    }

    @Test
    public void testSave() throws FileNotFoundException {
        //given
        Biblioteka biblioteka = new Biblioteka();

        List<Utwor> listaUtworow = new ArrayList<>();
        listaUtworow.add(new Utwor("Highway to hell", "AC/DC", 1970));
        listaUtworow.add(new Utwor("Thunder", "AC/DC", 1200));
        listaUtworow.add(new Utwor("randomSong", "AC/DC", 2343));
        biblioteka.addCD(new PlytaCd("Back in black", "2004", listaUtworow));

        List<Utwor> listaUtworow2 = new ArrayList<>();
        listaUtworow2.add(new Utwor("Random Title", "Random Author", 4.1));
        biblioteka.addCD(new PlytaCd("Sample CD", "2000", listaUtworow2));

        //when
        biblioteka.save();

        //then
        ArrayList<PlytaCd> listaPlyt = biblioteka.getListaPlyt();
        listaPlyt.clear();

        assertEquals(0, listaPlyt.size());
        biblioteka.read();
        assertEquals(2, listaPlyt.size());
        assertEquals(3, listaPlyt.get(0).getUtwory().size());
        assertEquals(1, listaPlyt.get(1).getUtwory().size());
    }

    @Test
    public void testRead() throws FileNotFoundException {
        //given
        Biblioteka biblioteka = new Biblioteka();

        //when
        biblioteka.read();

        //then
        ArrayList<PlytaCd> listaPlyt = biblioteka.getListaPlyt();
        assertEquals(2, listaPlyt.size());
        assertEquals(3, listaPlyt.get(0).getUtwory().size());
        assertEquals(1, listaPlyt.get(1).getUtwory().size());
    }

}