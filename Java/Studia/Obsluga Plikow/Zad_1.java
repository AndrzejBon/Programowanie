import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;


public class Zad_1 {
  public static void main(String[] args) {
    Random rand = new Random();
    int Tab[];
    Tab = new int[30];
    try {
        FileWriter zapis = new FileWriter("Zad_1.txt");
        for (int i = 0; i<25; i++){
            Tab[i]=rand.nextInt(30)+1;
            zapis.write(Tab[i]+" ");
          }
          zapis.close();
    } catch (IOException e){
        System.out.println("Nie mozna zapisac do pliku");
    }
    
    
  }
}