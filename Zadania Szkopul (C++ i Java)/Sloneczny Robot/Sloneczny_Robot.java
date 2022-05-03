import java.util.Scanner;

public class Sloneczny_Robot {
    public static void main(String[] args) {
        int n,b,a,maksa; //n = dlugosc odcinka, b - poj baterii, a - poj akumulatora, maksa - maksymalna pojemnosc akumulatora
        int pt=0; //pt - pokonana trasa
        int Swi[] = new int[200009]; // tablica swiatla
        Scanner czytaj = new Scanner(System.in);
        n = czytaj.nextInt();
        b = czytaj.nextInt();
        a = czytaj.nextInt();
        maksa = a;
        for(int i=1; i<=n; i++){
            Swi[i] = czytaj.nextInt();
        }
        czytaj.close();
        for(int i=1; i<=n; i++){
            if(Swi[i]==1 && b!=0 && a<maksa){
                b--;
                a++;
                pt++;
            }
            else if(a!=0){
                a--;
                pt++;
            }
            else if(Swi[i]==0 && a==0 && b!=0){
                b--;
                pt++;
            }
            else if(a==0 && b==0){
                break;
            }
        }
        System.out.println(pt);
    }
}
