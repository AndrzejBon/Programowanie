import java.util.Random;

public class Zad_1 {
    public static void main(String[] args){
        Random rand = new Random();
        float Tab[];
        Tab = new float[15];
        for(int i=0; i<10; i++){
            Tab[i] = rand.nextInt(10);
            System.out.print(Tab[i]+" ");
        }
        System.out.print("\n");
        for(int i=0; i<10; i++){
            Tab[i]/=2;
            System.out.print(Tab[i]+" ");
        }
        System.out.print("\n");
    }
}
