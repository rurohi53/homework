package Urok3and4;

public class zadanije4_2 {
    public static void main(String[] args)
    {
        String s = "       ЙНШЦ лавы ЩВ з %:выфзп ргавз паавпва авы эээ ''' dqw ''12  ";
        String BlockSymbols = "`~!@#$%^&*()_-=+<>?/\\|'\":;{}[].,№;?/ 123456789";
        int sum = WordsAmount(s, BlockSymbols);

        System.out.println("\nКоличество слов = " + sum + "\n");


    }

        public static boolean compareSymbol(String Proverka, char ch)

            {
                boolean Yes = true;
                char Symbol;
                for (int i = 0; i < Proverka.length(); i++ )
                {
                    Symbol = Proverka.charAt(i);
                    if ( ch == Symbol )
                    {
                        Yes = false;
                        break;
                    }
                }
                return Yes;
            }

            public static int WordsAmount (String s,String BlockSymbols)
            {
                char symbol;
                int sum = 0;
                String NewString = "";
                for(int i = 0; i < s.length(); i++)
                {
                    symbol = s.charAt(i);
                    boolean b = compareSymbol(BlockSymbols,symbol);
                    if ( b )
                        {
                            NewString += symbol;//
                    }
                    else
                    {
                        if (!NewString.equals(""))
                        {
                            sum++;

                            System.out.println(NewString);
                            NewString = "";
                        }
                    }
                }
                if (!NewString.equals(""))
                {
                    sum++;
                    System.out.println(NewString + "\n");
                }
                return sum;

            }
        }


