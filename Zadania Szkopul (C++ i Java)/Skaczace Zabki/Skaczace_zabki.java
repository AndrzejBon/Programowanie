import java.util.Scanner;

public class Skaczace_zabki {
    public static void main(String[] args) {
        long poz,p,t,s,z,tmp,tmp2; // poz - pozycja zabki, p - dlugosc skoku do przodu, t - dlugosc skoku do tylu, s - ilosc skokow, z - ilosc zabek
        Scanner czytaj = new Scanner(System.in);

        z = czytaj.nextLong();
        for(int i=1; i<=z; i++){
            p = czytaj.nextLong();
            t = czytaj.nextLong();
            s = czytaj.nextLong();
            czytaj.close();
            poz = 0;
            tmp = s/2;
            tmp2 = p-t;
            if(tmp2 != 0){
                for(int j=1; j<=tmp; j++){
                    poz += tmp2;
                }
            }
            if(s%2 == 1){
                poz += p;
            }
            System.out.println(poz);
        }
    }
}
