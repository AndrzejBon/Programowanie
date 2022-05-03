import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Zad_5 {
    public static void main(String[] args){
        int Tab[][];
        Random rand = new Random();
        int a = rand.nextInt(5)+5;
        int b = rand.nextInt(5)+5;
        Tab = new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                Tab[i][j]=rand.nextInt(10);
                System.out.print(Tab[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
