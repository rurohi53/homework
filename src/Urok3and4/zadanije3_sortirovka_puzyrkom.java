package Urok3and4;

import java.util.Arrays;

public class zadanije3_sortirovka_puzyrkom {
    public static void main(String[] args) {
        int marks[] = new int[10];

        boolean gotovo = true ;
        int temp;

            for (int i = 0; i < 10; i++)
                marks[i] = (int) (Math.random() * 10 + 1);

        System.out.println(Arrays.toString(marks));


        while (gotovo == true) {
            gotovo = false;
        for (int i = 0; i<marks.length-1; i++) {
            if (marks[i] > marks[i + 1]) {
                gotovo = true;

                temp = marks[i];
                marks[i] = marks[i+1];
                marks[i+1] = temp;
            }
        }

        }
        System.out.println(Arrays.toString(marks));

    }
}
