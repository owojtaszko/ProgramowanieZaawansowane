import lombok.Getter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
public class Biblioteka {

    private ArrayList<PlytaCd> listaPlyt = new ArrayList<>();

    public void addCD(PlytaCd plytaCd) {
        listaPlyt.add(plytaCd);
    }


    public void save() throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("biblioteka.txt");
        listaPlyt.forEach(plytaCd -> {
            zapis.println("---");

            String title = plytaCd.getTitle();
            String year = plytaCd.getYear();

            zapis.println(title);
            zapis.println(year);

            plytaCd.getUtwory().forEach(utwor -> {
                String titleUtwor = utwor.getTitle();
                String author = utwor.getAuthor();
                double time = utwor.getTime();

                zapis.print(titleUtwor);
                zapis.print("%");
                zapis.print(author);
                zapis.print("%");
                zapis.print(time);
                zapis.println();
            });
        });


        //zapis.println("Ala ma kota, a kot ma Alę");
        zapis.close();
    }

    public void read() throws FileNotFoundException {
        Scanner odczyt = new Scanner(new File("biblioteka.txt"));
        List<Utwor> utwory = null;
        String title = null;
        String year = null;
        PlytaCd tmp = null;
        int licznik = 0;

        while (odczyt.hasNextLine()) {
            String line = odczyt.nextLine();
            switch (line) {
                case "---":
                    licznik = 0;
                    utwory = new ArrayList<>();
                    break;
                default:
                    if (licznik == 0) {
                        title = line;
                    } else if (licznik == 1) {
                        year = line;
                        tmp = new PlytaCd(title, year, utwory);
                        listaPlyt.add(tmp);
                    } else {
                        String[] tab = line.split("%");
                        utwory.add(new Utwor(tab[0], tab[1], Double.valueOf(tab[2])));
                    }
                    licznik++;
            }
        }
    }

    public void popCDName(String cdName) {
        PlytaCd cd = listaPlyt.stream()
                .filter(a -> a.getTitle().equals(cdName))
                .findAny()
                .orElse(null);
        if (cd != null) {
            listaPlyt.remove(cd);
        }
    }

    public PlytaCd search(String albumTitle) {
        return listaPlyt.stream()
                .filter(a -> a.getTitle()
                        .equals(albumTitle))
                .findAny()
                .orElse(null);
    }

    public String toString() {
        return listaPlyt.stream()
                .map(a -> a.toString())
                .reduce("", (tmp, a) -> tmp += a);
    }

}