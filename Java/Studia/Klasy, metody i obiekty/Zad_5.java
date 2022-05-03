class pieczywo{
    String nazwa;
    int waga;
    String skladniki[] = new String[2];


    void wyswietl(){
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Waga: " + waga + "g");
        System.out.println("Skladniki: " + skladniki[0] + ", " + skladniki[1]);
    }
}


public class Zad_5 {
    public static void main(String[] args) {
        pieczywo bulka = new pieczywo();
            bulka.nazwa = "Bulka";
            bulka.waga = 100;
            bulka.skladniki[0] = "Maka pszenna";
            bulka.skladniki[1] = "Jajko";
            bulka.wyswietl();
        
        System.out.println("");


        pieczywo chleb = new pieczywo();
            chleb.nazwa = "Chleb";
            chleb.waga = 700;
            chleb.skladniki[0] = "Maka pszenna";
            chleb.skladniki[1] = "Drozdze";
            chleb.wyswietl();
            
    }
}