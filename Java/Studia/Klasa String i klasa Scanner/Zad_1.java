import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Zad_1 {
    public static void main(String[] args){
        DateTimeFormatter dzien = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter miesiac = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter rok = DateTimeFormatter.ofPattern("YYYY");
        DateTimeFormatter godzmin = DateTimeFormatter.ofPattern("hh:mm");
        LocalDateTime teraz = LocalDateTime.now();
        System.out.println("Dzien: "+dzien.format(teraz)+"\nMiesiac: "+miesiac.format(teraz)+"\nRok: "+rok.format(teraz)+"\nGodzina i minuta: "+godzmin.format(teraz));
    }
}
