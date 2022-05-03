import java.util.Random;
import java.lang.Math;
public class Zad_8 {
    public static void main(String[] args){
        int A=0,B=7;
        int tmp,test;
        Random rand = new Random();
        test=rand.nextInt(10)+1;
        System.out.println("Wartosc ilosci przypadkow testowania: "+test);
        for(int i=1;i<=test;i++){
            tmp=rand.nextInt(6)+1;
            System.out.println("Pietro: "+tmp);
            //System.out.println(Math.abs(tmp-A)+" "+Math.abs(tmp-B));
            if( Math.abs(tmp-A) < Math.abs(tmp-B) ){
                A=tmp;
                System.out.println("Pojedzie winda: A ");
            }   
                else if( Math.abs(tmp-B) < Math.abs(tmp-A) ){
                    B=tmp;
                    System.out.println("Pojedzie winda: B ");
                }
                    else if( Math.abs(tmp-A) == Math.abs(tmp-B) ){
                        if(A<B){
                            A=tmp;
                            System.out.println("Pojedzie winda: A ");
                        }    
                        else{
                            B=tmp;
                            System.out.println("Pojedzie winda: B ");
                        }
                    }
                            
                
        }
    }
}
