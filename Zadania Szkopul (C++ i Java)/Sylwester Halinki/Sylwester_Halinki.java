import java.util.Scanner;

public class Sylwester_Halinki {
    public static void main(String[] args) {
        int ta,chl; // ta - ilosc tancow; chl - ilosc chlopakow
        int p=1,k=1,tmp,wynik = -1000; // poczatek i koniec gegawicy
        int Tab[] = new int[100005];
        Scanner czytaj = new Scanner(System.in);
        ta = czytaj.nextInt();
        chl = czytaj.nextInt();
        for(int i=1; i<=ta; i++){
            Tab[i] = czytaj.nextInt();
        }
        czytaj.close();
        while(k < ta+1){
            if(Tab[k] != Tab[k+1] && Tab[k+1] != 0){
                k++;
            }
            else{
                tmp = k - p + 1;
                wynik = Math.max(tmp, wynik);
                p = k + 1;
                k = p;
            }
        }
        System.out.println(wynik);
    }
}
