import java.util.Scanner;

public class Binarny_Podatek {
    public static void main(String[] args) {
        String bin; // liczba w kodzie binarnym
        int a,zera; // a - ilosc zapytan, zera - ilosc zer w kodzie
        Scanner czytaj = new Scanner(System.in);

        a = czytaj.nextInt();
        for(int i=1; i<=a; i++){
            bin = czytaj.next();
            zera=0;
            for(int j=0; j<bin.length(); j++){
                if(bin.charAt(j) == '0'){
                    zera++;
                }
            }
            if(zera != bin.length()){
                System.out.print("1");
            }
            for(int k=1; k<=zera; k++){
                System.out.print("0");
            }
            System.out.println();
        }
        czytaj.close();
    }
}
