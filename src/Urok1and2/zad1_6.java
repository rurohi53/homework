package Urok1and2;

public class zad1_6 {
    public static void main(String[] args) {
        double a, b, c, d, e, f;
        a = 3;
        b = 6;
        c = 3;
        d = 11;
        e = 5;
        f = 15;
        if ((e >= (a + c)) && (f >= d && f >= d))
            System.out.println("Влезет");
         else if ((e >= (a + d)) && (f >= c && f >= b))
            System.out.println("Влезет");
         else if ((e >= (b + c)) && (f >= a && f >= d))
            System.out.println("Влезет");
         else if ((e >= (b + d)) && (f >= a && f >= c))
            System.out.println("Влезет");
         else if ((f >= (a + c)) && (e >= d && e >= d))
                System.out.println("Влезет");
         else if ((f >= (a + d)) && (e >= c && e >= b))
                System.out.println("Влезет");
         else if ((f >= (b + c)) && (e >= a && e >= d))
                System.out.println("Влезет");
         else if ((f >= (b + d)) && (e >= a && e >= c))
                System.out.println("Влезет");
        else System.out.println("Не влезет");

    }
}


