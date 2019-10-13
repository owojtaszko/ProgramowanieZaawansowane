package uczen;

public class PeselValidator {

//    Rozważmy PESEL osoby urodzonej 8 lipca 1902 roku, płci żeńskiej (parzysta końcówka numeru z serii – 0362). Czyli mamy wówczas 0207080362. Teraz kolejne cyfry należy przemnożyć przez odpowiednie wagi i dodać do siebie.
//0*1 + 2*3 + 0*7 + 7*9 + 0*1 + 8*3 + 0*7 + 3*9 + 6*1 + 2*3 = 0 + 6 + 0 + 63 + 0 + 24 + 0 + 27 + 6 + 6 = 132
//    Wynik dzielimy modulo przez 10.
//            132 mod 10 = 2
//    A następnie odejmujemy od 10
//            10 - 2 = 8.
//    I wynik dzielimy znów modulo 10
//            8 mod 10 = 8
//    Cyfra kontrolna to 8, zatem nasz prawidłowy numer PESEL to: 02070803628

    public boolean validate(String pesel){
        //nie  pozwalamy aby pesel był nullem
        if (pesel == null){
            return false;
        }
        //nie pozwalamy aby pesel miał inną długośc niż 11 cyfr
        if (pesel.length()!=11){
            return false;
        }
        //przetwarzamy ciąg znaków na tablicę znaków
        char[] tablicaZnakow = pesel.toCharArray();
        int[] tablicaCyfr = new int[tablicaZnakow.length];

        // przetworzenie tablicy znaków na tablicę cyfr
        try {
            for (int i = 0; i < tablicaZnakow.length; i++) {
                tablicaCyfr[i] = Integer.valueOf(String.valueOf(tablicaZnakow[i]));
            }
        }catch (NumberFormatException e){
            return false;
        }

        int suma = tablicaCyfr[0]*1 + tablicaCyfr[1]*3 + tablicaCyfr[2]*7 + tablicaCyfr[3]*9 + tablicaCyfr[4]*1
                + tablicaCyfr[5]*3 + tablicaCyfr[6]*7 + tablicaCyfr[7]*9 + tablicaCyfr[8]*1 + tablicaCyfr[9]*3;

        suma = suma %10;
        suma = 10 - suma;
        suma = suma% 10;

        return suma == tablicaCyfr[10];
    }
}
