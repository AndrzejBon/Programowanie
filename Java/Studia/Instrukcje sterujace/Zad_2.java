import java.util.Random;

public class Zad_2 {
    public static void main(String[] args){
        Random rand = new Random();
        int liczba = rand.nextInt(100);
        for(int i=2;i<=9;i++){
            if(liczba%i==0)
                System.out.println("Liczba "+liczba+" jest podzielna przez "+i);
            else
                System.out.println("Liczba "+liczba+" nie jest podzielna przez "+i);
        }
    }
}
