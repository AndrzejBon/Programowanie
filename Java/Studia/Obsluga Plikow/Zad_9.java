import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class Zad_9 {
    public static void main(String[] args) throws IOException {


        String imie = "", przerwaa = "";
        String nazwisko = "", przerwab = "";
        String numer_albumu = "", przerwac = "";
        String kier_stud = "", przerwad = "";


        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj swoje dane. Imie: ");
        imie = odczyt.next();
        System.out.println("Nazwisko: ");
        nazwisko = odczyt.next();
        System.out.println("Numer Albumu: ");
        numer_albumu = odczyt.next();
        System.out.println("Kierunek Studiow: ");
        kier_stud = odczyt.next();
        odczyt.close();
        
        int a=15-imie.length()-1;
        for(int i = 0; i < a; i++){
            przerwaa+=" ";
        } przerwaa+="|\n";


        int b=15-nazwisko.length()-1;
        for(int i = 0; i < b; i++){
            przerwab+=" ";
        } przerwab+="|\n";


        int c=15-numer_albumu.length()-1;
        for(int i = 0; i < c; i++){
            przerwac+=" ";
        } przerwac+="|\n";


        int d=15-kier_stud.length()-1;
        for(int i = 0; i < d; i++){
            przerwad+=" ";
        } przerwad+="|\n";


        FileWriter zapis = new FileWriter("Zad_9.txt");


        zapis.write("-----------------------------------\n");
        zapis.write("|Imie             | " + imie + przerwaa);
        zapis.write("-----------------------------------\n");
        zapis.write("|Nazwisko         | " + nazwisko + przerwab);
        zapis.write("-----------------------------------\n");
        zapis.write("|Numer albumu     | "+ numer_albumu + przerwac);
        zapis.write("-----------------------------------\n");
        zapis.write("|Kierunek Studiow | "+ kier_stud + przerwad);
        zapis.write("-----------------------------------");
        zapis.close();
    }
}