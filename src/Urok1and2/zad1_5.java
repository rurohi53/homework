package Urok1and2;

public class zad1_5 {
    public static void main(String[] args) {

        /*29 февраля высокогосного года - работает
         * конец года - работает
         * 28 февраля любого года - работает
         */

        int day, month,year;
        day = 31;
        month =12 ;
        year = 2011;
        if (month == 6 || month == 9 || month == 10 || month == 11 ) {
            if (day<30)
                System.out.println(++day +"."+ month + "." + year);
            else
            System.out.println(01 +"."+ ++month + "." + year);
        } else if (month == 2) {
                if (day<28)
                    System.out.println(++day +"."+ month + "." + year);
            else if ((year%400 == 0 || year%4 == 0) && (year%100 != 0) && day == 28)
                System.out.println(++day +"."+ month + "." + year);
            else System.out.println(01 +"."+ ++month + "." + year);
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 12  ) {
            if (day < 31)
                System.out.println(++day + "." + month + "." + year);
            else if (day == 31 && month == 12) System.out.println(01 + "." + 01 + "." + ++year);
            else System.out.println(01 + "." + ++month + "." + year);
        }



        else System.out.println("qwe");
            }

        }








