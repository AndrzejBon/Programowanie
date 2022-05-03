import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Zad_8 {
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("Zad_4.txt");
        Scanner odczyt = new Scanner(plik);
        String linia = odczyt.nextLine();
        System.out.println(linia);
        odczyt.close();
    }
}