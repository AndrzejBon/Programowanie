import java.util.Scanner;

public class Login_dla_kazdego {
    public static void main(String[] args) {

        String a,b; // a - imie, b - nazwisko
        Scanner czytaj = new Scanner(System.in);
        a = czytaj.next();
        b = czytaj.next();
        czytaj.close();
        String result = "";
        result += a.charAt(0);
        for(int i = 1; i < a.length(); i++){
            if(a.charAt(i) < b.charAt(0)){
                result += a.charAt(i);
            }
            else{
                break;
            }
        }
        result += b.charAt(0);
        System.out.println(result);
    }
}
