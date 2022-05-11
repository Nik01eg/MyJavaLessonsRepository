package Homework.Second;

import java.util.Arrays;

interface BrandsName{
    public static final String FIRST_BRAND = "Chevrolet";
    public static final String SECOND_BRAND = "Lada";
    public static final String THIRD_BRAND= "VolksWagen";
    public static final String FOURTH_BRAND= "Ford";
    public static final String FIFTH_BRAND= "Volvo";
    public static final String SIXTH_BRAND= "Mazda";
    public static final String SEVENTH_BRAND= "Renault";
    public static final String EIGHTH_BRAND= "Kia";
    public static final String NINTH_BRAND= "Honda";
    public static final String TENTH_BRAND = "Seat";
    public static final String ELEVENTH_BRAND= "BMW";
    public static final String TWELFTH_BRAND= "Mersedes";
    public static final String THIRTEENTH_BRAND= "Audi";
    public static final String FOURTEENTH_BRAND= "Mitsubishi";
    public static final String FIFTEENTH_BRAND= "RollsRoyce";
}

class ArrayOfCars implements BrandsName{
    public static Car [] CreateAndGetCarsArray(int carNumbers){
        Car [] array = new Car[carNumbers];
        String carsBrand;

        for(int c = 0; c < array.length; c++){
            int ran = (int)(Math.random() * 100.0D);
            if (ran < 16) carsBrand = BrandsName.FIRST_BRAND;
            else if (ran < 22) carsBrand = BrandsName.SECOND_BRAND;
            else if (ran < 28) carsBrand = BrandsName.THIRD_BRAND;
            else if (ran < 34) carsBrand = BrandsName.FOURTH_BRAND;
            else if (ran < 40) carsBrand = BrandsName.FIFTH_BRAND;
            else if (ran < 46) carsBrand = BrandsName.SIXTH_BRAND;
            else if (ran < 52) carsBrand = BrandsName.SEVENTH_BRAND;
            else if (ran < 58) carsBrand = BrandsName.EIGHTH_BRAND;
            else if (ran < 64) carsBrand = BrandsName.NINTH_BRAND;
            else if (ran < 70) carsBrand = BrandsName.TENTH_BRAND;
            else if (ran < 76) carsBrand = BrandsName.ELEVENTH_BRAND;
            else if (ran < 82) carsBrand = BrandsName.TWELFTH_BRAND;
            else if (ran < 88) carsBrand = BrandsName.THIRTEENTH_BRAND;
            else if (ran < 94) carsBrand = BrandsName.FOURTEENTH_BRAND;
            else carsBrand = BrandsName.FIFTEENTH_BRAND;

            Car newCar = new Car(carsBrand,"dhf", 23, 423, 4235, 345, 534);
            array[c] = newCar;
        }
        return array;
    }
}

public class Car{

    String carsBrand;
    String carsModel;
    int doorsNumber;
    int seatsNumbers;
    double engineVolume;
    double fuelConsumptionPer100kilometers;
    double maxSpeed;

    Car(String carsBrand, String carsModel, int doorsNumber, int seatsNumbers, double engineVolume, double fuelConsumptionPer100kilometers, double maxSpeed) {
        this.carsBrand = carsBrand;
        this.carsModel = carsModel;
        this.doorsNumber = doorsNumber;
        this.seatsNumbers = seatsNumbers;
        this.engineVolume = engineVolume;
        this.fuelConsumptionPer100kilometers = fuelConsumptionPer100kilometers;
        this.maxSpeed = maxSpeed;

    }
    public static void main(String [] args){
        System.out.print(Arrays.toString(ArrayOfCars.CreateAndGetCarsArray(10)));
    }

}

