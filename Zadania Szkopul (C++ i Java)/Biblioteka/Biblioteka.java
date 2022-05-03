import java.util.Scanner;

public class Biblioteka {
    public static void main(String[] args) {
        int Ksi[] = new int[200010];
        int k, id, L=0, R=-1; // k - ilosc polecen, zn - znak, id - indeks, L,R - kolejnosc ksiazki od lewej i prawej
        char zn;
        int tmp1,tmp2,tmp3;
        Scanner czytaj = new Scanner(System.in);

        k = czytaj.nextInt();
        for(int i=1; i<=k; i++){
            zn = czytaj.next().charAt(0);
            id = czytaj.nextInt();
            if(zn == 'R'){
                R++;
                Ksi[id] = R;
            }
            else if(zn == 'L'){
                L++;
                Ksi[id]=(0-L);
            }
            else if(zn == '?'){
                tmp1 = R-Ksi[id];
                tmp2 = L+Ksi[id];
                tmp3 = Math.min(tmp1,tmp2);
                System.out.println(tmp3);
            }
        }
        czytaj.close();
    }
}
