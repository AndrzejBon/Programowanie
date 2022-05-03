import java.util.Scanner;

public class Jaskinia_Diamentow {
    public static void main(String[] args) {
        int Tab[][] = new int[1005][1005]; // tablica komnat
        int Pref[][] = new int[1005][1005]; // tablica prefiksow
        int najw=-1; // najwieksza mozliwa do zebrania ilosc diamentow w obszarze
        int n, m, k, temp; // n,m - wymiary mapy, k - ilosc zapytan, temp = tymczasowa zmienna
        int a, b, c, d; // a,b - koordynaty lewego gornego rogu obszaru; c,d - koordynaty prawego dolnego roku obszaru
        Scanner czytaj = new Scanner(System.in);
        n = czytaj.nextInt();
        m = czytaj.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                Tab[i][j] = czytaj.nextInt();
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                Pref[i][j] = Tab[i][j] + Pref[i-1][j] + Pref[i][j-1] - Pref[i-1][j-1];
            }
        }
        k = czytaj.nextInt();
        for(int i=1; i<=k; i++){
            a = czytaj.nextInt();
            b = czytaj.nextInt();
            c = czytaj.nextInt();
            d = czytaj.nextInt();
            temp = Pref[c][d] - Pref[a-1][d] - Pref[c][b-1] + Pref[a-1][b-1];
            najw = Math.max(temp, najw);
        }
        czytaj.close();
        System.out.println(najw);
    }
}
