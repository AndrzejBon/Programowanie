import java.util.Scanner;

public class Zad_7 {
    public static void main(String[] args){
        Scanner czytaj = new Scanner(System.in);
        String[] slowa = new String[10];
        System.out.println("Podaj slowa: ");
        slowa[1] = czytaj.next();
        slowa[2] = czytaj.next();
        slowa[3] = czytaj.next();
        slowa[4] = czytaj.next();
        slowa[5] = czytaj.next();
        czytaj.close();

        for(int i=1;i<5;i++){
            for(int j=i+1;j<=5;j++){
                int blad=0;
                if(slowa[i].length()==slowa[j].length()){
                    for(int k=0;k<slowa[1].length();k++){
                        if(slowa[i].charAt(k)!=slowa[j].charAt(k)){
                            blad++;
                        }
                        if(blad>1){
                            break;
                        }
                    }

                }
                if(blad==1){
                    System.out.println("Wyrazy: "+slowa[i]+" oraz "+slowa[j]+" sa metagramami");        
                }
            }
        }
    }
}
