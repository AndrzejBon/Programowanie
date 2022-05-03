import java.util.Scanner;

public class Zbieranie_informacji {
    public static void main(String[] args) {
        int kom,inf=0,p=1,wynik=0; // kom - liczpa komputeruf w żendzie oraz fragmentuf informacyji; inf - posiadane informacje; p - pozycja
        int kier=1; // kier - kierunek ruchu, 1 - prawo, 0 - lewo;
        int Dro[] = new int[1005]; // tablica z wartościami potrzebnymi do dostania się do kolejnego laptopa;
        Scanner czytaj = new Scanner(System.in);
        Dro[0] = -20;
        kom = czytaj.nextInt();
        for(int i=1; i<=kom; i++){
            Dro[i] = czytaj.nextInt();
        }
        czytaj.close();
        while(inf < kom){
            if(Dro[p] <= inf && Dro[p] >=0){
                Dro[p] = -10;
                inf++;
                if(kier == 1){
                    p++;
                }
                else{
                    p--;
                }
            }
            else{
                if(kier == 1){
                    p++;
                }
                else{
                    p--;
                }
            }
            if(inf < kom){
                if(p == kom || p == 0){
                    kier = (1 - kier);
                    wynik++;
                }
            }
        }
        System.out.println(wynik);
        
    }
}
