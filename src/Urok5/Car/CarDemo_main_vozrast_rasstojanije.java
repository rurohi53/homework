package Urok5.Car;

import java.time.LocalDate;
import java.time.Period;

class CarDemo_main_vozrast_rasstojanije {
    public static void main(String[] args) {
        double litry;
        double dist = 260;
        Car_construktor golf = new Car_construktor(26,11, 12);
        Car_construktor bus = new Car_construktor(21, 15, 12);

        litry = golf.fuelNeeded(dist);
        System.out.println(litry + " литров топлива понадобится, чтобы проехать " + dist + " km");
        litry = bus.fuelNeeded(dist);
        System.out.println(litry + " литров топлива понадобится, чтобы проехать " + dist + " km");



        if (golf.range() > bus.range()) {
            System.out.println("Гольф проедет большее расстояние на полном баке");
        } else if (golf.range() < bus.range()){
            System.out.println("Бус проедет большее расстояние на полном баке");
        } else System.out.println("Проедут одинаковое расстояние");

        System.out.println("Гольф проедет  " + golf.range() + " km" + "\nБус проедет " + bus.range() + "km");


        LocalDate dateGolf = LocalDate.of(2000, 12,5);

        LocalDate dateBus = LocalDate.of(2001, 2, 3);
        System.out.println("Возраст гольфа составляет: " + Period.between(LocalDate.now(), dateGolf));
        System.out.println("Возраст буса составляет: " + Period.between(LocalDate.now(), dateBus));
        int value = dateGolf.compareTo(dateBus);

        if (value < 0)
            System.out.println("Гольф старше");
        else if (value == 0)
            System.out.println("Год выпуска одинаковый");
        else
            System.out.println("Бус старше");


    }
}






