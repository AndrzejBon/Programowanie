import java.util.Scanner;

public class Zad_4 {
    public static void main(String[] args){
        Scanner czytaj = new Scanner(System.in);
        String wyraz, odwrot = "";
        System.out.println("Podaj wyraz: ");
        wyraz = czytaj.next();
        int dl = wyraz.length();
        czytaj.close();
        for (int i = (dl - 1); i >=0; --i) {
          odwrot = odwrot + wyraz.charAt(i);
        }

        if (wyraz.toLowerCase().equals(odwrot.toLowerCase())) {
          System.out.println(wyraz + " jest palindromem");
        }
        else {
          System.out.println(wyraz + " nie jest palindromem");
        }
    }
}
