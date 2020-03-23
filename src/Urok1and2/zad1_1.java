package Urok1and2;

public class zad1_1 {
    public static void main(String[] args) {
        int s = 7500000;
        int sec, secInWeek, secInDay, hours;
        int m;
        int min, h, days, weeks, w, d;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hours = h % 24;
        days = (h-hours)/24;
        w = days % 7;
        weeks = (days-w)/7;
        System.out.println(weeks + " weeks " + w + " days " + hours + " hours " + min + " minutes " + sec + " seconds");
    }
}

