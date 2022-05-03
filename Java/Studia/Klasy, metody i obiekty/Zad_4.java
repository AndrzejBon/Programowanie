class ksiazki{
    String tytul;
    String autor;
    String gatunek;
    int rok_wydania;
    int tab[]= {2010,2011,2012,2013,2014,2015,2016,2017,2018,2019};
    void rok(int a){
        rok_wydania = tab[a];
    }
    void wyswietl(){
        System.out.println("Tytul: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Gatunek: " + gatunek);
        System.out.println("Rok wydania: " + rok_wydania);
    }
}


public class Zad_4 {
    public static void main(String[] args) {
        ksiazki ks1 = new ksiazki();
            ks1.tytul = "Metro 2035";
            ks1.autor = "Dmitrij Gluchowski";
            ks1.gatunek = "science fiction";
            ks1.rok(5);
            ks1.wyswietl();
        System.out.println("");


        ksiazki ks2 = new ksiazki();
            ks2.tytul = "Sezon Burz";
            ks2.autor = "Andrzej Sapkowski";
            ks2.gatunek = "fantasy";
            ks2.rok(3);
            ks2.wyswietl();
    }
}