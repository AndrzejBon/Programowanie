import java.util.Scanner;

public class Zad_5 {
    public static void main(String[] args){
        Scanner czytaj = new Scanner(System.in);
        System.out.println("Podaj wyrazy");
        String wyraz1 = czytaj.next(), wyraz2 = czytaj.next();
        czytaj.close();
        int Tab[],Tab2[];
        boolean test=false;
        Tab = new int[300];
        Tab2 = new int[300];

        if(wyraz1.length()==wyraz2.length()){
            int dl=wyraz1.length();
            for(int i=0; i<dl; i++){
                Tab[wyraz1.charAt(i)]++;
                Tab2[wyraz2.charAt(i)]++;
            }
            for(int i=0;i<256;i++){
                if(Tab[i]==Tab2[i]){
                    test = true;
                }
                else{
                    System.out.println("Nie sa anagramami");
                    test = false;
                    break;
                }
            }
        }
        else{
            System.out.println("Nie moga byc anagramem, rozna dlugosc wyrazow");
        }

        if(test==true){
            System.out.println("Sa anagramami");
        }
    }
}
