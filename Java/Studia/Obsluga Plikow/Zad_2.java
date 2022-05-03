import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;


public class Zad_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int Tab[][];
        Tab = new int[15][15];
        try {
            FileWriter zapis = new FileWriter("Zad_2.txt");
            for(int i = 0; i < 10; i++){
                for (int j = 0; j < 10; j++) {
                    Tab[i][j]=rand.nextInt(30)+68;
                    zapis.write(Tab[i][j]+" ");
                }
                zapis.write("\n");
            }
            zapis.close();
        } catch (IOException e) {
           System.out.println("Nie udało się zapisać do pliku");
        }
    }
}