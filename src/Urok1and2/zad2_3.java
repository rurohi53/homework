package Urok1and2;

public class zad2_3 {
    public static void main(String[] args) {
        int x = 7;
        boolean proverka = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                proverka = false;

            }}
            if (proverka) System.out.println("Является простым");
            else System.out.println("Не является простым");



    }
}
