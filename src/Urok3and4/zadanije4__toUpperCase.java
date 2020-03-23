package Urok3and4;

public class zadanije4__toUpperCase {
    static String LowerToUpper(String Stroka) {
        String result = "";
        char ch = ' ';
        for (int i = 0; i < Stroka.length(); i++) {


            if (Stroka.charAt(i) >= 'a' && Stroka.charAt(i) <= 'z') {
                ch = (char)(Stroka.charAt(i) - 32);
            }
            else if (Stroka.charAt(i) >= 'а' && Stroka.charAt(i) <= 'я') {
                ch = (char)(Stroka.charAt(i) - 32);
            }

            else {
                ch = (char)(Stroka.charAt(i));
            }

            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(LowerToUpper("йцукенгшщзфывапролджячсЙЦУУЦЙУЦЙмитьбю"));
        System.out.println(LowerToUpper("qwertyuiiop[asdfghjkl;'QWEWQEWQzxcvbnm,./"));

    }
}
