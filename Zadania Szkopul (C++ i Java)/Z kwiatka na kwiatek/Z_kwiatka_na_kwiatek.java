import java.util.Scanner;

public class Z_kwiatka_na_kwiatek {
    public static void main(String[] args) {
        int kw,sk,tmp,ap,wynik = 0; // kw - liczba kwiatków, sk - długość skoku, ap - aktualna pozycja
        String Liczba;
        int Grz[] = new int [105]; // grzadka
        Scanner czytaj = new Scanner(System.in);

        kw = czytaj.nextInt();
        sk = czytaj.nextInt();
        Liczba = czytaj.next();
        czytaj.close();
        ap = 1;
        for(int i=1; i<=kw; i++){
            Grz[i] = Liczba.charAt(i-1) - 48;
        }
        tmp = sk;
        while(ap < kw){
            if(Grz[1] == 0){
                wynik = -1;
                break;
            }
            else if(Grz[ap+tmp] == 1){
                ap += tmp;
                tmp = sk;
                wynik++;
            }
            else{
                tmp--;
                if(tmp == 0){
                    wynik =-1;
                    break;
                }
            }
        }
        System.out.println(wynik);
    }    
}
