import java.util.Scanner;

public class Zad_2 {
    public static void main(String[] args){
        Scanner czytaj = new Scanner(System.in);
        String imie;
        String nazwisko;
        System.out.println("Podaj imie: ");
        imie = czytaj.next().toUpperCase();
        System.out.println("Podaj Nazwisko: ");
        nazwisko = czytaj.next().toUpperCase();
        System.out.println(imie +" "+ nazwisko);
        czytaj.close();
    }
}
