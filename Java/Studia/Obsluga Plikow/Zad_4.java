import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Zad_4 {
    public static void main(String[] args) {
        Scanner wczytaj = new Scanner(System.in);
        int a, b;
        a = wczytaj.nextInt();
        b = wczytaj.nextInt();
        wczytaj.close();
        try {
            FileWriter zapis = new FileWriter("Zad_4.txt");
            for(int i = a; i<=b; i++){
                zapis.write(i+" ");
            }
            zapis.close();
        } catch (IOException e) {
            System.out.println("Nie mozna zapisac do pliku");
        }
    }
}