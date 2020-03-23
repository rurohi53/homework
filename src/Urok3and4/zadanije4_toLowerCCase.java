package Urok3and4;

public class zadanije4_toLowerCCase {

    static String Upper_to_lower(String Stroka) {
        String result = " ";
        char ch = ' ';
        for (int i = 0; i < Stroka.length(); i++) {


            if (Stroka.charAt(i) >= 'A' && Stroka.charAt(i) <= 'Z') {
                ch = (char)(Stroka.charAt(i) + 32);
            }

            else if (Stroka.charAt(i) >= 'А' && Stroka.charAt(i) <= 'Я') {

                ch = (char)(Stroka.charAt(i) + 32);
            }

            else {
                ch = (char)(Stroka.charAt(i));
            }

            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Upper_to_lower("ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭfddfgdfЯЧСМИТЬБЮ."));
        System.out.println(Upper_to_lower("QWERTYUIOP[ASDFGHJавыаывавKL;'ZXCVBNM,./"));

    }

}
