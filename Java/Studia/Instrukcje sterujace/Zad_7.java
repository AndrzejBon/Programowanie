public class Zad_7 {
    public static void main(String[] args){
        int a=0,b=1,tmp=0;
        System.out.print(a+" ");
        for(int i=1;i<=20;i++){
            System.out.print(b+" ");
            tmp=a+b;
            a=b;
            b=tmp;
            
        }
    }
}
