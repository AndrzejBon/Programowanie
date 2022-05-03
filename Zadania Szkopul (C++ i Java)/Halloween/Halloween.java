import java.util.Scanner;

public class Halloween {
    public static void main(String[] args) {
        int Tab[] = new int[100046]; // tablica domow
        int Pref[] = new int[100046]; // tablica prefiksow
        int t,n; // t - liczba zapytan, n - liczba domow
        Scanner czytaj = new Scanner(System.in);
        t = czytaj.nextInt();
        n = czytaj.nextInt();

        for(int i=1; i<=n; i++){
            Tab[i] = czytaj.nextInt();
        }
        Pref [0] = 0;

        for(int i=1; i<=n; i++){
            Pref[i]=Pref[i-1]+Tab[i];
        }
        int a,b; // a - poczatek zakresu domow, b - koniec zakresu domow
        for(int i=1; i<=t; i++){
            a = czytaj.nextInt();
            b = czytaj.nextInt();
            System.out.println(Pref[b]-Pref[a-1]);
        }
        czytaj.close();
    }
}
