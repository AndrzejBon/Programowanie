import java.util.Random;

public class Zad_9 {
    public static void main(String[] args){
        Random rand = new Random();
        int N;
        N=rand.nextInt(163)+1;
        System.out.println("Ilosc cegiel: "+N);
        System.out.println("P M");
        for(int i=1;N>=0;i++){
            if(N>i){
                System.out.print(i+" ");
                N-=i;
            }   
            else{
                System.out.println(N);
                System.out.println("Patlu wylozy ostatnia cegle");
                break;
            }
            if(N>i*2){
                System.out.print(i*2+"\n");
                N-=i*2;
            }
            else{
                System.out.println(N);
                System.out.println("Matlu wylozy ostatnia cegle");
                break;
            }
                
        }
    }
}
