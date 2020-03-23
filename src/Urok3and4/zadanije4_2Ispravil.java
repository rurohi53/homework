package Urok3and4;

import java.util.Arrays;

public class  zadanije4_2Ispravil {

    public static void main(String[] args) {

        String s = " Слово слово и слово 123 !№;%:?*()   gfggdgfd ?*?*";

        int sum = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (!(Character.isLetterOrDigit(charArray[i]))) {
                charArray[i] = ' ';
            }

        }
        s = String.valueOf(charArray);
        String[] StringArray = s.split(" ");
        for (int i = 0; i < StringArray.length; i++) {
            StringArray[i].trim();

            if (StringArray[i].length() > 0) {
                sum++;
            }
        }
        System.out.println("Количество слов в строке " + sum);
        System.out.println(Arrays.toString(StringArray));
    }
}
