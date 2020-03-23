package Urok3and4;

public class zadanije4_3 {

        public static void main(String[] args) {
            String Stroka = "ваыап авыавыавые паываппр авыавыж авыавый";

            String[] words = Stroka.split(" ");
            StringBuilder newSentence = new StringBuilder();

            for(String word : words) {
                newSentence.append(word.charAt(word.length()-1));
            }

            System.out.println(newSentence);
        }
    }

