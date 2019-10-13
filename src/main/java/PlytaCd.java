import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class PlytaCd {

    private String title;
    private String year;
    private List<Utwor> utwory = new ArrayList<Utwor>();

    // wyszukiwanie na strumieniu
    public Utwor search(String query) {
        return utwory.stream().filter(a -> a.getTitle().equals(query))
                .findAny().orElse(null);
    }

    // to samo wyszukiwanie w pętli
    public Utwor search2(String query) {
        for (Utwor utwor : utwory) {
            if (utwor.getTitle().equals(query)) {
                return utwor;
            }
        }
        return null;
    }

    public String toString() {
        List<String> listaUtworow = utwory.stream()
                .map(a -> a.toString())
                .collect(Collectors.toList());
        String result = listaUtworow.stream()
                .reduce("", (tmp, a) -> tmp += "\n" + a);

        return title + " " + year + " " + result;
    }
}