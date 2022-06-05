package Homework.Second;

import java.util.Objects;

interface BrandsName{
    public static final String FIRST_BRAND = "Chevrolet";
    public static final String SECOND_BRAND = "Lada";
    public static final String THIRD_BRAND = "VolksWagen";
    public static final String FOURTH_BRAND = "Ford";
    public static final String FIFTH_BRAND = "Volvo";
    public static final String SIXTH_BRAND = "Mazda";
    public static final String SEVENTH_BRAND = "Renault";
    public static final String EIGHTH_BRAND = "Kia";
    public static final String NINTH_BRAND = "Honda";
    public static final String TENTH_BRAND = "Seat";
    public static final String ELEVENTH_BRAND = "BMW";
    public static final String TWELFTH_BRAND = "Mersedes";
    public static final String THIRTEENTH_BRAND = "Audi";
    public static final String FOURTEENTH_BRAND = "Mitsubishi";
    public static final String FIFTEENTH_BRAND = "RollsRoyce";
}

interface AutoRun{
    public abstract boolean CarRun();
    public abstract int CarSpeed();
}

class ArrayOfCars implements BrandsName{
    public static Car [] CreateAndGetCarsArray(int carNumbers){
        Car [] array = new Car[carNumbers];

        for(int c = 0; c < array.length; c++){
            String carsBrand;
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


public class Car implements AutoRun{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doorsNumber == car.doorsNumber && seatsNumbers == car.seatsNumbers && Double.compare(car.engineVolume, engineVolume) == 0 && Double.compare(car.fuelConsumptionPer100Kilometers, fuelConsumptionPer100Kilometers) == 0 && Double.compare(car.maxSpeed, maxSpeed) == 0 && Objects.equals(carsBrand, car.carsBrand) && Objects.equals(carsModel, car.carsModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carsBrand, carsModel, doorsNumber, seatsNumbers, engineVolume, fuelConsumptionPer100Kilometers, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carsBrand='" + carsBrand + '\'' +
                ", carsModel='" + carsModel + '\'' +
                ", doorsNumber=" + doorsNumber +
                ", seatsNumbers=" + seatsNumbers +
                ", engineVolume=" + engineVolume +
                ", fuelConsumptionPer100kilometers=" + fuelConsumptionPer100Kilometers +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean CarRun() {
        boolean CarRunningNow = false;

        //Some code witch decide is car running or not

        if(CarRunningNow) return true;
        else return false;
    }

    @Override
    public int CarSpeed() {
        int carSpeed = 0 ;

        //Some code witch calculating car speed

        return carSpeed;
    }



    private String carsBrand;
    private String carsModel;
    private int doorsNumber;
    private int seatsNumbers;
    private double engineVolume;
    private double fuelConsumptionPer100Kilometers;
    private double maxSpeed;

    Car(String carsBrand, String carsModel, int doorsNumber, int seatsNumbers, double engineVolume, double fuelConsumptionPer100Kilometers, double maxSpeed){
        this.carsBrand = carsBrand;
        this.carsModel = carsModel;
        this.doorsNumber = doorsNumber;
        this.seatsNumbers = seatsNumbers;
        this.engineVolume = engineVolume;
        this.fuelConsumptionPer100Kilometers = fuelConsumptionPer100Kilometers;
        this.maxSpeed = maxSpeed;

    }

    Car(){
        carsBrand = null;
        carsModel = null;
        doorsNumber = 0;
        seatsNumbers = 0;
        engineVolume = 0.0;
        fuelConsumptionPer100Kilometers = 0.0;
        maxSpeed = 0;
    }


    public String getCarsBrand () {
        return carsBrand;
    }
    public void setCarsBrand (String carsBrand){
        this.carsBrand = carsBrand;
    }

    public String getCarsModel(){
        return carsModel;
    }
    public void setCarsModel(String carsModel){
        this.carsModel = carsModel;
    }

    public int getDoorsNumber(){
        return doorsNumber;
    }
    public void setDoorsNumber(int doorsNumber){
        this.doorsNumber = doorsNumber;
    }

    public int getSeatsNumbers(){
        return seatsNumbers;
    }
    public void setSeatsNumbers(int seatsNumbers){
        this.seatsNumbers = seatsNumbers;
    }

    public double getEngineVolume(){
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume){
        this.engineVolume = engineVolume;
    }

    public double getFuelConsumptionPer100Kilometers(){
        return fuelConsumptionPer100Kilometers;
    }
    public void setFuelConsumptionPer100Kilometers(double fuelConsumptionPer100Kilometers){
        this.fuelConsumptionPer100Kilometers = fuelConsumptionPer100Kilometers;
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public static void main(String [] args) {
        Car[] arr = ArrayOfCars.CreateAndGetCarsArray(10);
        for (Car c : arr) System.out.println(c.toString());

        System.out.println(" ");

        AutoRun newCar = new Car();
        System.out.println(newCar.CarRun() + " " + newCar.CarSpeed());
    }
}

