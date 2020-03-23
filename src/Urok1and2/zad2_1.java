package Urok1and2;

public class zad2_1 {
    public static void main(String[] args) {
        double sr = 0;
        double fact = 1;
        int n = 0;
        int x = (int)(Math.random()*5);
        for (int i=1; i<x; i++) {
            fact = fact * i;
            n++;
        }
        if (n !=0) {
            sr = fact / n;
        } else
            sr = 0;



        System.out.println("Значение факториала рандомного числа: " + fact);
        System.out.println("Среднее арифметическое: " + sr);
        System.out.println(x);

        System.out.println("Количество шагов i будет равно n, а именно " + n);
    }
}
