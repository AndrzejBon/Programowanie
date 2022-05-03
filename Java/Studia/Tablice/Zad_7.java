import java.util.Scanner;

public class Zad_7 {
    public static void main(String[] args){
        Scanner czytaj = new Scanner(System.in);
        int Tab[];
        Tab = new int[1000045];
        int N, K,tmp;
        N=czytaj.nextInt();
        K=czytaj.nextInt();
        boolean perm = false;
        for(int i=0;i<N;i++){
            tmp=czytaj.nextInt();
            Tab[tmp]++;
        }
        czytaj.close();
        for(int i=1;i<=K;i++){
            if(Tab[i]>0){
                perm = true;
            }
            else{
                perm = false;
                break;
            }
        }
        if(perm == true){
            System.out.println("TAK");
        }
        else{
            System.out.println("NIE");
        }
    }
}
