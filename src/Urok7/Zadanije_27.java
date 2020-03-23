package Urok7;
// создать коллекцию, наполнить ее случайными числами. удалить повторяющиеся числа
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zadanije_27 {
    public static void main(String[] args) {
        int marksQuantity = 20;
        List<Integer> numbers = new ArrayList();
        for (int i = 0; i < marksQuantity; i++) {
            int a = (int) (Math.random() * 10 + 1);
            numbers.add(a);
        }
        System.out.println(numbers);
        Set<Integer> hs = new HashSet<>(numbers);
        numbers.clear();
        numbers.addAll(hs);
        System.out.println(hs);
    }
}
