package Urok3and4;

public class zadanije3_3 {
    public static void main(String[] args) {
        int mass[] = new int[5];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 5 + 1);
        }
        for (int v : mass) {
            System.out.println(v);
        }

        System.out.println();

        int n = mass.length;
        int perevorot;

        for (int i = 0; i < n / 2; i++) {
            perevorot = mass[n - i - 1];
            mass[n - i - 1] = mass[i];
            mass[i] = perevorot;
        }
        for (int v : mass) {
            System.out.println(v);
        }
    }
}