package Urok3and4;

public class zadanije3_1 {
    public static void main(String[] args) {
    int marks[] = new int[20];

    for (int i=0; i < 20; i++) {
        marks[i] = (int)(Math.random()*10+1);
    }
    int maxMark = marks [0];
    int maxIndex = 0;
    for (int i=0; i<marks.length; i++) {
        if(maxMark < marks[i]) {
            maxMark = marks[i];
            maxIndex = i;
        }
    }
    System.out.println("Max mark = " + maxMark);
    System.out.println("Max index = " + maxIndex);
        for (int v : marks)
            System.out.println(v);
}
}