import java.util.Scanner;

public class Drinki_dla_Przyjaciol {
    public static void main(String[] args) {
        int bp,bs,bj; // bp - butelki piotra, bs - butelki stefana, bj - butelki jozka
        int cc,ft,sp; // cc - butelki coli, ft - butelki fanty, sp - butelki spritea
        Scanner czytaj = new Scanner(System.in);
        bp = czytaj.nextInt();
        bs = czytaj.nextInt();
        bj = czytaj.nextInt();
        cc = czytaj.nextInt();
        ft = czytaj.nextInt();
        sp = czytaj.nextInt();
        czytaj.close();
        
        if(bp <= cc){
            cc = cc - bp;
            bp = 0;
            if(cc <= bs){
                bs = bs - cc;
                cc = 0;
                if(ft <= bs){
                    bs = bs - ft;
                    ft = 0;
                    if(sp <= bj){
                        bj = bj-sp;
                        sp = 0;
                    }
                    else{
                        sp = sp - bj;
                        bj = 0;
                    }
                }
                else{
                    ft = ft - bs;
                    bs = 0;
                    if(ft <= bj){
                        bj = bj - ft;
                        ft = 0;
                        if(sp <= bj){
                            bj = bj - sp;
                            sp = 0;
                        }
                        else{
                            sp = sp - bj;
                            bj = 0;
                        }
                    }
                    else{
                        ft = ft - bj;
                        bj = 0;
                    }
                }
            }
            else{
                cc = cc - bs;
                bs = 0;
                if(cc <= bj){
                    bj = bj - cc;
                    cc = 0;
                    if(ft <= bj){
                        bj = bj - ft;
                        ft = 0;
                        if(sp <= bj){
                            bj = bj - sp;
                            sp = 0;
                        }
                        else{
                            sp = sp - bj;
                            bj = 0;
                        }
                    }
                    else{
                        ft = ft - bj;
                        bj = 0;
                    }
                }
                else{
                    cc = cc - bj;
                    bj = 0;
                }
            }
        }
        if(bp <= 0 && bs <= 0 && bj <= 0)
            System.out.println("TAK");
        else
            System.out.println("NIE");
    }
}
