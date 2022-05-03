import java.util.Scanner;

public class General {
    public static void main(String[] args) {
        long Tab[] = new long[1000000]; // tablica miast
        long n, k; // n - liczba miast, k - potencjal wojskowy
        int  P = 1, i = 1; // P - poczatek gasienicy, i - koniec gasienicy
        Scanner czytaj = new Scanner(System.in);
        n = czytaj.nextLong();
        k = czytaj.nextLong();
        for(i=1;i<=n;i++){
            Tab[i] = czytaj.nextLong();
        }
        czytaj.close();
        Tab[i] = 999999999999999999L;

        i=1;
        while(P <= n){
            while(Tab[P] + k >= Tab[i]){
                i++;
            }
            i--;
            System.out.print(i+" ");
            P++;
        }
        
    } 
}
