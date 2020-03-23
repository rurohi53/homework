package Urok7;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Имеется текст. Следует составить для него частотный словарь
public class Zadanije_29 {
//метод преобразования текста в массив слов
    public static List<String> getWords(String text) {
        List<String> words = new ArrayList<>();
        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(text);
        int lastIndex = breakIterator.first();
        while (BreakIterator.DONE != lastIndex) {
            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
                words.add(text.substring(firstIndex, lastIndex));
            }
        }
        return words;
    }
    public static void main(String[] args) {
        String text = "Я вас любил: любовь еще, быть может,\n" +
                "В душе моей угасла не совсем;\n" +
                "Но пусть она вас больше не тревожит;\n" +
                "Я не хочу печалить вас ничем.";
        Map<String, Integer> counterMap = new HashMap<>();
        for (String country : getWords(text) ) {
            counterMap.compute(country, (k, v) -> v == null ? 1 : v + 1);
        } System.out.println(counterMap);
    }
}
