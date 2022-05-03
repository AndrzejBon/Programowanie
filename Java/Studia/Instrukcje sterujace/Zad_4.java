import java.util.Random;

public class Zad_4 {
    public static void main(String[] args){
        Random rand = new Random();
        int liczba = rand.nextInt(60);
        System.out.println( (liczba%2==0) ? "Liczba "+liczba+" jest podzielna przez 2" : "Liczba "+liczba+" nie jest podzielna przez 2");
    }
}
