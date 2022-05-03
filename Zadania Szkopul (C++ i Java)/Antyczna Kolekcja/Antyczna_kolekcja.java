import java.util.Scanner;

public class Antyczna_kolekcja {
    static String ToString(int i){
        String wynik="";
        char cyfra;
        while(i!=0){
            int tmp = i%10 + 48;
            cyfra = (char)tmp;
            i=i/10;
            wynik=cyfra+wynik;
        }

        return wynik;
    }

    public static void main(String[] args) {
        int han,kwo,z,s=0;
        boolean odw=false;
        String result = "";
        int Tabh[][] = new int[55][55];

        

        Scanner czytaj = new Scanner(System.in);
        han = czytaj.nextInt();
        kwo = czytaj.nextInt();
        for(int i=1; i<=han; i++){
            z = czytaj.nextInt();
            Tabh[i][0]=z;
            for(int j=1; j<=z; j++){
                Tabh[i][j] = czytaj.nextInt();
            }
        }
        czytaj.close();
        for(int i=1; i<=han; i++){
            for(int j=1; j<=Tabh[i][0]; j++){
                if(Tabh[i][j]<kwo){
                    if(odw==false){
                        s++;
                        result += ToString(i);
                        result += " ";
                        odw = true;
                    }
                }
            }
            odw = false;
        }
        System.out.println(s+"\n"+result);
    }
}
