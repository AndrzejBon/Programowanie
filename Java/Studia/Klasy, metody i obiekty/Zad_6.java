class malarstwo{
    String tytul;
    String autor;
    String rok_powstania;
    String technika;
    String cena;


    void wyswietl(){
        System.out.println("Tytul: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Technika: " + technika);
        System.out.println("Rok wydania: " + rok_powstania);
        System.out.println("Cena: " + cena + " dolarow");
    }
}


public class Zad_6 {
    public static void main(String[] args) {
        
        malarstwo ob1 = new malarstwo();
            ob1.tytul = "Zbawiciel świata";
            ob1.autor = "Leonardo da Vinci";
            ob1.technika = "Farby olejne na desce"; 
            ob1.rok_powstania = "1506-1513";
            ob1.cena = "450,3 mln";
            ob1.wyswietl();


        System.out.println("");


        malarstwo ob2 = new malarstwo();
            ob2.tytul = "Gracze w karty";
            ob2.autor = "Paul Cézanne";
            ob2.technika = "Farby olejne na płótnie"; 
            ob2.rok_powstania = "1893-1896";
            ob2.cena = "250 mln";
            ob2.wyswietl();
    }
}