import java.util.Random;
import java.util.Scanner;
import java.util.Formatter;

public class Zad_6 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner czytaj = new Scanner(System.in);
        int liczba;
        System.out.println("Podaj liczbe: ");
        liczba = czytaj.nextInt();
        int tmp;
        czytaj.close();
        for(int i=0;i<10;i++){
            tmp = rand.nextInt(9)+1;
            liczba-=tmp;
        }
        Formatter wypisz = new Formatter();
        wypisz.format("%+3d", liczba);
        System.out.println(wypisz);
    }
}
