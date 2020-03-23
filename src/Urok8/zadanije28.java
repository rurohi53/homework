package Urok8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
// коллекция оценок, найти наибольшую с использованием итератора

public class zadanije28 {
    public static void main(String[] args) {
        int marksQuantity = 20;
        List<Integer> numbers = new ArrayList();
        for (int i = 0; i < marksQuantity; i++) {
            int a = (int) (Math.random() * 10 + 1);
            numbers.add(a);
        }
        System.out.println(numbers);
        ListIterator<Integer> iterator = numbers.listIterator();
        int max = numbers.get(0);
        while (iterator.hasNext()) {
            int item = iterator.next();
            if (numbers.get(item)>max) {
                max = numbers.get(item);
            }
        }
        System.out.println(max);
    }
}

