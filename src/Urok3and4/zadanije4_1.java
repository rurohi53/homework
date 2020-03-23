package Urok3and4;

public class  zadanije4_1 {

        public static void main (String[] args) {

            String s = " 34219w%^&*()324pjifdsopiasdp[ авыавыавы12354356345----!№;%:?*()_ fdisjfsdpi a123/.,m";

            System.out.println(Stroka(s));
            System.out.println("Количество удаленных символов равно: " + (s.length()-Stroka(s).length()));


        }

        public static String Stroka (String BezSimvolov) {
            StringBuilder Changes = new StringBuilder();
            for (int i = 0; i < BezSimvolov.length(); i++) {
                if (Character.isLetterOrDigit(BezSimvolov.charAt(i)))
                    Changes.append(BezSimvolov.charAt(i));

            }
            return Changes.toString();




        }
    }

