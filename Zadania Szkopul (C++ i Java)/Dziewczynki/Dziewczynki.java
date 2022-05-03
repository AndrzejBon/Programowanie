import java.util.Scanner;

public class Dziewczynki {
    public static void main(String[] args) {
        int Tab[] = new int[1000005];
        int n,k,Wynik = 99999999; // n - liczba osob w szeregu; k - liczba dziewczynek, jaka ma stac pod rzad; Wynik - liczba chlopcow ktorzy powinni usunas sie z szerergu
        Scanner czytaj = new Scanner(System.in);
        n = czytaj.nextInt();
        k = czytaj.nextInt();
        
        for(int i=1; i<=n; i++){
            Tab[i] = czytaj.nextInt();
        }
        czytaj.close();
        int P = 1, D = 0, C = 0; // P - poczatek gosienicy, D - liczba dziewczynek w szeregu, C - liczba chlopcow w szeregu
        while(Tab[P] == 1){
            P++;
        }

        for(int i=P; i<=n; i++){
            if(Tab[i] == 0){
                D++;
            }
            else{
                C++;
            }
            if(D == k){
                Wynik = Math.min(Wynik, C);
                if(Tab[P] == 0){
                    P++;
                    D--;
                }
                while(Tab[P] == 1){
                    P++;
                    C--;
                }
            }
        }
        if(Wynik != 99999999){
            System.out.println(Wynik);
        }
        else{
            System.out.println("NIE");
        }
    }    
}
