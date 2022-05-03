import java.util.Random;

public class Zad_3 {
    public static void main(String[] args){
        Random rand = new Random();
        int Tab[];
        Tab = new int[25];
        for(int i=0;i<25;i++){
            Tab[i]=rand.nextInt(100)+1;
            if(Tab[i]>50){
                System.out.print(Tab[i]+" ");
            }
        }
    }
}
