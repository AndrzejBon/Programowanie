public class Zad_4 {
    public static void main(String[] args){
        String Tab[][]={{ " -  ", " -  ", " -  ", " -  ", " 8  ", " 0  ", " 0  "},
                        { " 3  ", "3.5 ", " 0  ", "4.5 ", " 8  ", " 0  ", " 0  "},
                        { " 5  ", " 0  ", " 0  ", " 0  ", " 0  ", " 0  ", " 0  "},
                        { " 0  ", " 0  ", " 0  ", "4.5 ", " 8  ", " 0  ", " 0  "},
                        { " 3  ", "3.5 ", " 0  ", "4.5 ", " 8  ", " 0  ", " -  "}};
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
                System.out.print(Tab[i][j]);
            }
            System.out.print("\n");
        }
    }
}
