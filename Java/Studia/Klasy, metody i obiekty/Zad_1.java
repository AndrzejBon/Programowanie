class Telefony_komorkowe{
    String marka;
    String os;
    int os_ver;
    double przekatna_cal;
    double pam_wbud;


    void czy_android(){
        if(os=="android"){
            System.out.println("Masz telefon z systemem android");
        } else{
            System.out.println("Masz telefon z systemem innym niz android");
        }
    }


}


public class Zad_1 {
    public static void main(String[] args) {
        Telefony_komorkowe tel1 = new Telefony_komorkowe();
            tel1.marka = "Samsung";
            tel1.os = "android";
            tel1.os_ver = 11;
            tel1.przekatna_cal = 6.5;
            tel1.pam_wbud = 256;
            System.out.println("Telefon nr1 to telefon firmy " + tel1.marka +", z systemem " + tel1.os + " w wersji " + tel1.os_ver + ", o przekatnej "+ tel1.przekatna_cal + "\" oraz pamieci wbudowanej " + tel1.pam_wbud + " GB.");
            tel1.czy_android();
        Telefony_komorkowe tel2 = new Telefony_komorkowe();
            tel2.marka = "Apple";
            tel2.os = "iOS";
            tel2.os_ver = 13;
            tel2.przekatna_cal = 6.8;
            tel2.pam_wbud = 512;
            System.out.println("Telefon nr1 to telefon firmy " + tel2.marka +", z systemem " + tel2.os + " w wersji " + tel2.os_ver + ", o przekatnej "+ tel2.przekatna_cal + "\" oraz pamieci wbudowanej " + tel2.pam_wbud + " GB.");
            tel2.czy_android();
    }
}