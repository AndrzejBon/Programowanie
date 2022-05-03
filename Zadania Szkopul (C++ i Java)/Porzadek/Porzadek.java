import java.util.Scanner;

public class Porzadek {
    public static void main(String[] args) {
        String S; // ogrod
        long Nast[] = new long[1000046]; // tablica prefiksow nasturcji
        long Rub[] = new long[1000046]; // tablica prefiksow rudbekii
        long Wspol[] = new long[1000046]; // tablica prefiksow wspolczynnika nieporzadku
        long n, t, a, b, Wyn; // n - dlugosc ogrodu, t - liczba zapytan, a - poczatek obszaru zapytania, b - koniec obszaru zapytania, wyn - wynik zapytania
        Scanner czytaj = new Scanner(System.in);
        n = czytaj.nextLong();
        S = czytaj.next();
        for(int i=1; i<=n; i++){
            if(S.charAt(i-1) == 'N'){
                Nast[i] = Nast[i-1] + 1;
                Rub[i] = Rub[i-1];
                Wspol[i] = Wspol[i-1] + Rub[i];
            }
            if(S.charAt(i-1) == 'R'){
                Nast[i] = Nast[i-1];
                Rub[i] = Rub[i-1] + 1;
                Wspol[i] = Wspol[i-1];
            }
        }
        t = czytaj.nextLong();
        for(int i=1; i<=t; i++){
            a = czytaj.nextLong();
            b = czytaj.nextLong();
            Wyn = Wspol[(int)b] - Wspol[(int)a-1] - Rub[(int)a-1] * (Nast[(int)b] - Nast[(int)a-1]);
            System.out.println(Wyn); 
        }
        czytaj.close();
    }
}
