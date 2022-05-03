import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Zad_2 {
    public static void main(String[] args){
        Random rand = new Random();
        int Tab[];
        Tab = new int[105];
        for(int i=1; i<=100; i++){
            Tab[i] = rand.nextInt(100);
            System.out.print(Tab[i]+" ");
        }
        System.out.print("\n");
        for(int i=4; i<=100; i+=4){
            System.out.print("Tab["+i+"] = "+Tab[i]+", ");
        }

    }    
}
