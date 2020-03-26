package Urok9;

import java.io.*;

public class zadanije30 {
    public static void main(String[] args) {
        String Poema = "What women wander? Not many. All. A few.";
//заносим строчку в txt
        File file = new File("d:/newfile.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)){
            if (!file.exists()) {
                file.createNewFile();
            }
            fileOutputStream.write(Poema.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
//читаем строчку из txt и считаем количество слов и знаков препинания
        try {
            BufferedReader reader = new BufferedReader((new FileReader("d:/newfile.txt")));
            String poem = reader.readLine();
            int sumWords = 0;
            System.out.println(poem);
//считаем знаки препинания
            String dots = poem.replaceAll("\\w|\\d|\\s|\\p{L}", "");
            System.out.println("Знаков препинания: " + dots.length());
//считаем количество слов
            char[] charArrayWords = poem.toCharArray();
            for (int i = 0; i < charArrayWords.length; i++) {
                if (!(Character.isLetterOrDigit(charArrayWords[i]))) {
                    charArrayWords[i] = ' ';
                }
            }
            poem = String.valueOf(charArrayWords);
            String[] StringArray = poem.split(" ");
            for (String s : StringArray) {
                s.trim();
                if (s.length() > 0) {
                    sumWords++;
                }
            }
            System.out.println("Количество слов в строке: " + sumWords);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
