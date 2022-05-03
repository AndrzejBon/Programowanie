import java.util.Formatter;

public class Zad_3 {
    public static void main(String[] args){
        float a=1;
        float b;
        for(int i=1; i<=5; i++){
            b=a/i;
            Formatter liczba = new Formatter();
            liczba.format("%2.5f",b);
            System.out.println(liczba);
        }
    }
}
