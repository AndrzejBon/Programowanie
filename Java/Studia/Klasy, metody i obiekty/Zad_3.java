class filmy{
    String tytul;
    String rezyser;
    double ocena_IMDB;
    String gatunek;
    int rok_wydania;
    int ile_lat(){
        return 2022-rok_wydania;
    }
}


public class Zad_3 {
    public static void main(String[] args) {
        filmy film1 = new filmy();
            film1.tytul = "Na rauszu";
            film1.rezyser = "Thomas Vinterberg";
            film1.ocena_IMDB = 7.7;
            film1.gatunek = "Dramat/komedia";
            film1.rok_wydania = 2020;
            System.out.println("Film " + film1.tytul +  " w reżyserii " + film1.rezyser + ", z gatunku " + film1.gatunek + ", wydany w " + film1.rok_wydania + "(" + film1.ile_lat() + " lata temu). W serwisie IMDB otrzymal ocene: " + film1.ocena_IMDB);


        filmy film2 = new filmy();
            film2.tytul = "Gladiator";
            film2.rezyser = "Ridley Scott";
            film2.ocena_IMDB = 8.5;
            film2.gatunek = "Dramat historyczny";
            film2.rok_wydania = 2000;
            System.out.println("Film " + film2.tytul +  " w reżyserii " + film2.rezyser + ", z gatunku " + film2.gatunek + ", wydany w " + film2.rok_wydania + "(" + film2.ile_lat() + " lata temu). W serwisie IMDB otrzymal ocene: " + film2.ocena_IMDB);


    }
}