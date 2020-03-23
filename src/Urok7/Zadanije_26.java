package Urok7;
//создать список оценок учеников с помощью ArrayList заполнить случайными оценками. Удалить неудовлетворительные.

import java.util.ArrayList;

public class Zadanije_26 {
    public static void main(String[] args) {
        int marksQuantity = 10;
        int maxNegativeMark = 4;
        ArrayList<Integer> students = new ArrayList();
        for (int i = 0; i < marksQuantity; i++) {
            int a = (int) (Math.random() * 10 + 1);
            students.add(a);
        }

        System.out.println(students);

        ArrayList<Integer> deleteMarks = new ArrayList();
        for (int i = 0; i<marksQuantity; i++) {
            int m = students.get(i);
            if (m <= maxNegativeMark) {
                deleteMarks.add(m);
            }
        }
            students.removeAll(deleteMarks);
            System.out.println(students);
            }

    }

