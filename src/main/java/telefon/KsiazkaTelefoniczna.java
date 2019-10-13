package telefon;

import java.util.Map;
import java.util.TreeMap;

public class KsiazkaTelefoniczna {
    public static void main(String[] args) {
        Map<NrTelefoniczny, Wpis> ksiazka = new TreeMap();

        Osoba osoba = new Osoba("Jacek", "Bednarski", "ul. Kasztanowa 2, Lublin",
                new NrTelefoniczny("081", "502111111"));
        ksiazka.put(osoba.getNrTelefonu(), osoba);
        Osoba osoba1 = new Osoba("Ania", "Nowak", "ul. Olchowa 2, Lublin",
                new NrTelefoniczny("082", "502222222"));
        ksiazka.put(osoba1.getNrTelefonu(), osoba1);
        Osoba osoba2 = new Osoba("Kasia", "Fil", "ul. Bzowa 2, Lublin",
                new NrTelefoniczny("083", "502333333"));
        ksiazka.put(osoba2.getNrTelefonu(), osoba2);
        Osoba osoba3 = new Osoba("Ola", "Zdunek", "ul. Brzozowa 2, Lublin",
                new NrTelefoniczny("084", "502444444"));
        ksiazka.put(osoba3.getNrTelefonu(), osoba3);

        Firma firma = new Firma("Drutex", "ul. Długa 3, Lublin",
                new NrTelefoniczny("085", "555555555"));
        ksiazka.put(firma.getNrTelefonu(), firma);
        Firma firma2 = new Firma("Sklep", "ul. Krótka 3, Lublin",
                new NrTelefoniczny("086", "555666666"));
        ksiazka.put(firma2.getNrTelefonu(), firma2);
        Firma firma3 = new Firma("Magazyn", "ul. Mała 3, Lublin",
                new NrTelefoniczny("087", "555777777"));
        ksiazka.put(firma3.getNrTelefonu(), firma3);


        ksiazka.entrySet().forEach(a -> {
            System.out.println(a.getKey());
            System.out.println(a.getValue());
        });
    }
}