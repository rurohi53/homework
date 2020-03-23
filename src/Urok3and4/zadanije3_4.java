package Urok3and4;

public class zadanije3_4 {
    public static void main(String[] args) {
        int i,j;
        int baboczka[][] = new int[101][101];

        for (i = 0; i < baboczka.length / 2 + 1; i++) {
            for (j = 0; j < baboczka[i].length; j++) {
                if ((j < i) || (j >= (baboczka[i].length - i)))
                    baboczka[i][j] = 0;
                else
                    baboczka[i][j] = 1;
            }
        }


        for (i=baboczka.length-1; i>=baboczka.length/2; i--){
            for (j=0; j<baboczka[i].length; j++){
                if ((j<(baboczka[i].length-1-i)) || (j>i))
                    baboczka[i][j]=0;
                else
                    baboczka[i][j]=1;}
        }




        for (i=0;i<baboczka.length;i++) {
            for (j = 0; j < baboczka[i].length; j++) {
                System.out.print(baboczka[i][j]);
            }
            System.out.println();
        }





        }
    }

