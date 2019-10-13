package telefon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString

public class Osoba extends Wpis {

    private String imie;
    private String nazwisko;
    private String adres;
    private NrTelefoniczny nrTelefonu;

    public Osoba() {

    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public NrTelefoniczny getNrTelefonu() {
        return nrTelefonu;
    }

    @Override
    public String opis() {
        return "Dane kontaktowe osoby niebędącej firmą";
    }
}
