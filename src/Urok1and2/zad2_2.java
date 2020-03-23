package Urok1and2;

public class zad2_2 {
    public static void main(String[] args) {

        int num = 333;

        int sum= 0;
        while (num > 0 ){
            sum = sum + num%10;
            num = num / 10;

        }
        System.out.println("Сумма цифр в числе " + sum );
    }

    }

