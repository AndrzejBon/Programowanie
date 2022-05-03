import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Zad_6 {
    public static void main(String[] args) throws FileNotFoundException{
        File plik = new File("Zad_2.txt");
        Scanner odczyt = new Scanner(plik);
        int Tab[][] = new int[15][15];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Tab[i][j] = odczyt.nextInt();
                System.out.print(Tab[i][j]+" ");
            }
            System.out.print("\n");
        }
        odczyt.close();
    }
}