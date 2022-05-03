import java.util.Scanner;

public class Ozdoby_choinkowe {
    public static void main(String[] args) {
        int wyk, ark, zesz = 0; // wyk - ilosc ozdob do wykonania, ark - ilosc arkuszy w zeszycie, zesz - wymagana ilosc zeszytow
        int czer = 0, ziel = 0, nieb = 0; // czer - wymagana ilosc czerwonych arkuszy, ziel - wymagana ilosc zielonych arkuszy, nieb - wymagana ilosc niebieskich arkuszy

        Scanner czytaj = new Scanner(System.in);
        wyk = czytaj.nextInt();
        ark = czytaj.nextInt();
        czytaj.close();
        while(czer < wyk*2){
            czer += ark;
            zesz++;
        }
        while(ziel < wyk*5){
            ziel += ark;
            zesz++;
        }
        while(nieb < wyk*8){
            nieb += ark;
            zesz++;
        }
        System.out.println(zesz);
    }
}
