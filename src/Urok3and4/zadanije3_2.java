package Urok3and4;

public class zadanije3_2 {
    public static void main(String[] args) {

        int marks[] = new int[10];
        for (int i = 0; i<marks.length ; i++) {
            marks[i] = (int) (Math.random() *10  + 1);
        }
        int maxMark = marks[0];
        int minMark = marks[0];
        int indexMin = 0;
        int indexMax = 0;
        int summa = 0;



        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                indexMax = i;
            }
        }

        for (int i = 0; i < marks.length; i++) {
                if (minMark > marks[i]) {
                    minMark = marks[i];
                    indexMin =i;

                }
            }

        if (indexMin<indexMax) {
            for (int i=indexMin+1; i<indexMax; i++) {
                summa += marks[i];
            }
        }
        else if(indexMax<indexMin){
            for (int i=indexMax+1; i<indexMin; i++)
                summa += marks[i];

        }

            System.out.println("Max mark = " + maxMark);
            System.out.println("Min mark = " + minMark);
            System.out.println("Summa = " + summa);

            for (int v : marks)
                System.out.println(v);


    }
}
