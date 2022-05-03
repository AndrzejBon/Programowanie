public class Zad_6 {
    public static void main(String[] args){
        int Tab[][];
        int a=1;
        Tab = new int[7][7];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                Tab[j][i]=a;
                a++;
            }
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(Tab[i][j]<10){
                    System.out.print(" ");
                }
                System.out.print(Tab[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
