import java.util.Calendar;
import java.util.Formatter;

public class Zad_1 {
    public static void main(String[] args){
        Formatter data = new Formatter();
        Calendar dzisiaj = Calendar.getInstance();
        data.format("%Te \n%tB \n%TY \n%TR", dzisiaj,dzisiaj,dzisiaj,dzisiaj);
        System.out.println(data);
        data.close();
    }
}
