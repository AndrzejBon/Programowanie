import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Zad_5 {
    public static void main(String[] args) throws FileNotFoundException{
        int Tab[];
        Tab = new int[32];
        Random rand = new Random();
        File plik = new File("Zad_1.txt");
        Scanner odczyt = new Scanner(plik);
        int a = rand.nextInt(10)+1;
        for(int i = 0; i < 25; i++){
            Tab[i] = odczyt.nextInt()*a;
        }
        odczyt.close();
        for (int i = 0; i < 25; i++) {
            System.out.print(Tab[i] + " ");
        }
    }
}