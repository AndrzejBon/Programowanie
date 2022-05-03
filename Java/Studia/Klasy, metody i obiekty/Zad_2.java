class ubrania{
    String marka;
    int rozmiar;
    double cena;
    String kolor;
    String typ;


    double cena_po_przecenie(double przec){
        return cena*(1-(przec/100));
    }
}


public class Zad_2 {
    public static void main(String[] args) {
        ubrania ub1 = new ubrania();
            ub1.marka = "HM";
            ub1.kolor = "Zielony";
            ub1.rozmiar = 36;
            ub1.cena = 80;
            ub1.typ = "Spodnie";
            double tmp = ub1.cena_po_przecenie(20);
            System.out.println("Sa to " + ub1.typ + ", marki " + ub1.marka + " koloru " + ub1.kolor + ". Cena przed przecena: " + ub1.cena + ", cena po przecenie o 20%: " +tmp);


        ubrania ub2 = new ubrania();
            ub2.marka = "Sinsay";
            ub2.kolor = "Niebieski";
            ub2.rozmiar = 38;
            ub2.cena = 90;
            ub2.typ = "Spodenki";
            tmp = ub2.cena_po_przecenie(20);
            System.out.println("Sa to " + ub2.typ + ", marki " + ub2.marka + " koloru " + ub2.kolor + ". Cena przed przecena: " + ub2.cena + ", cena po przecenie o 20%: " +tmp);
    }
}