import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Zad_8 {
    private static String slowo = "statek";
    private static int blad=0;
    private static String gwiazdki = new String(new char[slowo.length()]).replace("\0", "*");

    public static void main(String[] args){
        
        Scanner czyt = new Scanner(System.in);

        while (blad<7 && gwiazdki.contains("*")){
            System.out.println("Slowo: "+gwiazdki);
            System.out.println("Zgadnij litere:");
            String traf = czyt.next();
            strzal(traf);
        }
        czyt.close();
    }

    public static void strzal(String traf){
            String nowegwiazdki = "";
            for( int i = 0; i < slowo.length(); i++){
                if(slowo.charAt(i)==traf.charAt(0)){
                    nowegwiazdki += traf.charAt(0);
                } 
                else if(gwiazdki.charAt(i) != '*'){
                    nowegwiazdki += slowo.charAt(i);
                } 
                else{
                    nowegwiazdki += "*";
                }
            }

            if (gwiazdki.equals(nowegwiazdki)){
                blad++;
                wisielec();
            }
            else{
                gwiazdki = nowegwiazdki;
            }
            if(gwiazdki.equals(slowo)){
                System.out.println("Brawo, odgadles slowo!! Slowo to: "+slowo);
            }
    }


public static void wisielec() {
    if (blad == 1) {
        System.out.println("Bledna litera, pierwszy blad");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
        System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|__");
    }
    if (blad == 2) {
        System.out.println("Bledna litera, drugi blad");
		System.out.println("__________");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
        System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|__");
    }
    if (blad == 3) {
        System.out.println("Bledna litera, trzeci blad");
		System.out.println("__________");
		System.out.println("|        |");
		System.out.println("|       / \\");
		System.out.println("|      |   |");
        System.out.println("|       \\_/");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
        System.out.println("|");
		System.out.println("|__");        
    }
    if (blad == 4) {
        System.out.println("Bledna litera, czwarty blad");
		System.out.println("__________");
		System.out.println("|        |");
		System.out.println("|       / \\");
		System.out.println("|      |   |");
        System.out.println("|       \\_/");
		System.out.println("|       _|_");
		System.out.println("|      /");
		System.out.println("|");
        System.out.println("|");
		System.out.println("|__");   
    }
    if (blad == 5) {
        System.out.println("Bledna litera, piaty blad");
		System.out.println("__________");
		System.out.println("|        |");
		System.out.println("|       / \\");
		System.out.println("|      |   |");
        System.out.println("|       \\_/");
		System.out.println("|       _|_");
		System.out.println("|      /   \\");
		System.out.println("|");
        System.out.println("|");
		System.out.println("|__");   
    }
    if (blad == 6) {
        System.out.println("Bledna litera, szosty blad, masz jeszcze jedna szanse");
		System.out.println("__________");
		System.out.println("|        |");
		System.out.println("|       / \\");
		System.out.println("|      |   |");
        System.out.println("|       \\_/");
		System.out.println("|       _|_");
		System.out.println("|      / | \\");
		System.out.println("|       / ");
        System.out.println("|      /");
		System.out.println("|__");   
    }
    if (blad == 7) {
        System.out.println("KONIEC GRY");
		System.out.println("__________");
		System.out.println("|        |");
		System.out.println("|       / \\");
		System.out.println("|      |   |");
        System.out.println("|       \\_/");
		System.out.println("|       _|_");
		System.out.println("|      / | \\");
		System.out.println("|       / \\");
        System.out.println("|      /   \\");
		System.out.println("|__");   
        System.out.println("Slowem bylo slowo: "+slowo);
    }
}

}