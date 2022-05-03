import java.util.Scanner;
import java.util.TooManyListenersException;
import java.lang.*;

public class Zakazane_palindromy {
    public static void main(String[] args) {
        String N,NN;
        Scanner czytaj = new Scanner(System.in);
        
        N = czytaj.next();
        czytaj.close();
        NN = Wspak(N);
        while(N.equals(NN)){
            StringBuffer tmp = new StringBuffer(N);
            tmp.deleteCharAt(N.length()-1);
            N = tmp.toString();
            NN = Wspak(N);
            if(N.length() < 1){
                System.out.println(0);
                return;
            }
        }
        System.out.println(N.length());
    }

    static String Wspak(String N){
        String NN=N;
        char tmp2;
        int n=N.length();
        for(int i=0; i<n; i++){
            StringBuilder tmp1 = new StringBuilder(NN);
            tmp2 = N.charAt(n-1-i);
            tmp1.setCharAt(i, tmp2);
            NN = tmp1.toString();
        }
        return NN;
    }
}
