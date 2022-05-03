public class Zad_3 {
    public static void main(String[] args){
        int suma = 0;
        int ciag = 5;
        for(int i=1;i<=10;i++){
            suma+=ciag;
            ciag+=5;
        }
        System.out.println(suma);
    }
}
