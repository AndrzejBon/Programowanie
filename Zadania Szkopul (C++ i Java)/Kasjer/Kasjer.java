import java.util.Scanner;

public class Kasjer {
    public static void main(String[] args) {
        int Poc[] = new int[100046]; // tablica czasu przybycia klientow
        int Time[] = new int[100046]; // tablica czasu zajmowanego przez klientow
        int wyn; // wynik zadania
        int n, L, a; // n - liczba klientow, L - czas trwania dnia pracy, a - dlugosc przerwy na papierosa
        Scanner czytaj = new Scanner(System.in);
        n = czytaj.nextInt();
        L = czytaj.nextInt();
        a = czytaj.nextInt();
        for(int i=1; i<=n; i++){
            Poc[i] = czytaj.nextInt();
            Time[i] = czytaj.nextInt();
        }
        czytaj.close();
        wyn = Poc[1]/a;
        for(int i=2; i<=n; i++){
            wyn += (Poc[i] - (Poc[i-1] + Time[i-1])) /a;
        }
        wyn += (L - (Poc[n] + Time[n]))/a;
        if(n == 0){
            wyn = L/a;
        }
        System.out.println(wyn);
    }
}
