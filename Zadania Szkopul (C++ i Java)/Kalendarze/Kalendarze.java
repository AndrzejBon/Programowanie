import java.util.Scanner;

public class Kalendarze {
    public static void main(String[] args) {
        int A[] = new int [1000046]; // kalendarz arbuzan
        int B[] = new int [1000046]; // kalendarz bananitow
        int Ap[] = new int [1000046]; 
        int Bp[] = new int [1000046];
        int n, m, z; // n - liczba miesiecy kalendarz arbuzan, m - liczba miesiecy kalendarz bannanitow, z - liczba zapytan
        int t1, t2, y; // t1 - liczba dni w zapytaniu, t2 - liczba miesiecy w zapytaniu, y - wynik wyszukiwania binarnego
        char zn; // zn - kierunek konwersji zapytania

        Scanner czytaj = new Scanner(System.in);
        n = czytaj.nextInt();
        m = czytaj.nextInt();
        for(int i=1; i<=n; i++){
            A[i] = czytaj.nextInt();
            Ap[i] = Ap[i-1] + A[i];
        }
        
        for(int i=1; i<=m; i++){
            B[i] = czytaj.nextInt();
            Bp[i] = Bp[i-1] + B[i];
        }
        z = czytaj.nextInt();
        
        for(int i=1; i<=z; i++){
            t1 = czytaj.nextInt();
            t2 = czytaj.nextInt();
            zn = czytaj.next().charAt(0);
            if(zn == 'A'){
                int S = Ap[t2-1] + t1;
                y = Binary_SearchB(S,m,Bp);
                t1 = y;
                t2 = S - Bp[y];
                System.out.println(t2+" "+(t1+1));
            }
            else{
                int S = Bp[t2-1] + t1;
                y = Binary_SearchA(S, n, Ap);
                t1 = y;
                t2 = S - Ap[y];
                System.out.println(t2+" "+(t1+1));
            }
        }
        czytaj.close();
    }

    static int Binary_SearchA(int S, int n,int Ap[]){
	    int B=0;
	    int E=n-1;
	    int M=(B+E)/2+1;
	    while(B!=E)
	    {
	    	if(Ap[M]>=S)
	    		E=M-1;
	    	else
	    		B=M;
	    	M=(B+E)/2+1;
	    }
	    return B;
    }

    static int Binary_SearchB(int S,int m, int Bp[] ){
	    int B=0;
	    int E=m-1;
    	int M=(B+E)/2+1;
    	while(B!=E)
    	{
    		if(Bp[M]>=S)
    			E=M-1;
    		else
    			B=M;
    		M=(B+E)/2+1;
    	}
    	return B;
    }
    
}
