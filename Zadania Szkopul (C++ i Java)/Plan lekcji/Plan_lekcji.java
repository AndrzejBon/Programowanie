import java.util.Scanner;

public class Plan_lekcji {
    public static void main(String[] args) {
        int T[] = new int[102];
        int n;
        Scanner czytaj = new Scanner(System.in);
        n = czytaj.nextInt();
        for(int i=0; i<n; i++){
            T[i] = czytaj.nextInt();
        }
        for(int i=1; i<n-1; i++){
            if(T[i-1]==1 && T[i+1]==1)
		    {
			    T[i]=1;
		    }
        }
        int wynik = 0;
        for(int i=0; i<n; i++){
            if(T[i] == 1){
                wynik++;
            }
        }
        System.out.println(wynik);
    }
}
