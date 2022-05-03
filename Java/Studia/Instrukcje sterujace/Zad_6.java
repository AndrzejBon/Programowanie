import java.util.Random;

public class Zad_6 {
    public static void main(String[] args){
        Random rand = new Random();
        int liczba = rand.nextInt(4)+1;
        System.out.println(liczba);
        switch(liczba){
            case 1:
                System.out.println("Jeden");
                break;
            case 2:
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");
                break;
            case 4:
                System.out.println("Cztery");
                break;
            case 5:
                System.out.println("Piec");
                break;
        }
    }
}
