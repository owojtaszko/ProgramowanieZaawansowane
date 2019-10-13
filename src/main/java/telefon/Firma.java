package telefon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString

public class Firma extends Wpis {

    private String nazwaFirmy;
    private String adresFirmy;
    private NrTelefoniczny nrTelefonu;

    public Firma() {

    }

    public String getAdresFirmy() {
        return adresFirmy;
    }

    public NrTelefoniczny getNrTelefonu() {
        return nrTelefonu;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    @Override
    public String opis() {
        return "Dane kontaktowe firmy";
    }
}
