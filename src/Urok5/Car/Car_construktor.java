package Urok5.Car;

public class Car_construktor {
    public Car_construktor(double speed, double fuelConsumption, double fuelCap) {
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.fuelCap = fuelCap;

    }

    double speed;
    double fuelConsumption;
    double fuelCap;



    double range() {
        return fuelCap/fuelConsumption*100;
    };
    double fuelNeeded(double km) {
        return  (km/fuelConsumption);
    }
}
