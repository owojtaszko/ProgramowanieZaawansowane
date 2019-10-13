import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Aplikacja {
    private static final Biblioteka BIBLIOTEKA = new Biblioteka();

    public static void main(String[] args) throws FileNotFoundException {

        Scanner odczyt = new Scanner(System.in);
        Scanner odczyt2 = new Scanner(System.in);
        String tmp;
        do {
            System.out.println("1- jeżeli chcesz zapisać bibliotekę");
            System.out.println("2- jeżeli chcesz odczytac dane z biblioteki");
            System.out.println("3- jeżeli chesz wyświetlić dane z biblioteki");
            System.out.println("4- jeżelii chcesz dodać płytę do biblioteki");
            System.out.println("5- jeśeli chcesz usunąc płytę z biblioteki");
            System.out.println("6- jeżeli chcesz wyszukać płytę");
            System.out.println("0- jeżeli chcesz zakończyę program");
            tmp = odczyt.nextLine();
            switch (tmp) {
                case "1":
                    BIBLIOTEKA.save();
                    break;
                case "2":
                    BIBLIOTEKA.read();
                    break;
                case "3":
                    System.out.println(BIBLIOTEKA);
                    break;
                case "4":
                    System.out.println("podaj nazwę płyty");
                    String title = odczyt.nextLine();
                    System.out.println("podaj rok wydania");
                    String year = odczyt.nextLine();
                    List<Utwor> lista = new ArrayList<>();
                    PlytaCd plytaCd = new PlytaCd(title, year, lista);
                    BIBLIOTEKA.addCD(plytaCd);
                    do {
                        System.out.println("podaj nazwę utworu");
                        String nazwaUtworu = odczyt.nextLine();
                        System.out.println("podaj wykonawcę utworu");
                        String autor = odczyt.nextLine();
                        System.out.println("podaj długośc utworu");
                        Double dlugoscUtworu = odczyt2.nextDouble();
                        lista.add(new Utwor(nazwaUtworu, autor, dlugoscUtworu));
                        System.out.println("czy dodać kolejny utwór t/n");
                        String wybor = odczyt.nextLine();
                        if ("n".equals(wybor)) {
                            break;
                        }
                    }
                    while (true);
                    break;
                case "5":
                    break;
                case "6":
                    System.out.println("Podaj nazwę płyty którą chcesz wyszukać ");
                    String nazwaPlyty = odczyt.nextLine();
                    PlytaCd result = BIBLIOTEKA.search(nazwaPlyty);
                    if (result != null) {
                        System.out.println(result);
                    } else {
                        System.out.println("nie znaleziono płyty o znalezionej nazwie");
                    }
                    break;
            }
            if ("0".equals(tmp)) {
                break;
            }
        }
        while (true);

    }
}