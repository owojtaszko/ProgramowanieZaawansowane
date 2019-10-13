package wypozyczalnia;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Utwor {
    private String title;
    private String author;
    private double time;

    public String toString() {return title+" "+author+ " "+time;
    }
}
