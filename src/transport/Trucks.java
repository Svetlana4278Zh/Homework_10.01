package transport;

import java.util.List;

import static transport.Validate.isNull;

public class Trucks extends Transport implements Competing{
    private DriverC driver;
    private LoadСapacityType loadСapacityType;
    public Trucks(String brand, String model, double engineVolume, List<Mechanic> mechanics, DriverC driver, LoadСapacityType loadСapacityType) {
        super(brand, model, engineVolume,mechanics);
        this.driver = driver;
        this.loadСapacityType = loadСapacityType;
    }

    public DriverC getDriver() {
        return driver;
    }

    public LoadСapacityType getLoadСapacityType() {
        return loadСapacityType;
    }

    public void setLoadСapacityType(LoadСapacityType loadСapacityType) {
        this.loadСapacityType = loadСapacityType;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + loadСapacityType;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль " + BrandAndModel() + " поехал");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовой автомобиль " + BrandAndModel() + " остановился");
    }

    @Override
    public void getPitStop() {
        System.out.println("Грузовой автомобиль " + BrandAndModel() + " на Пит-стопе");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга грузового автомобиля " + BrandAndModel());
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля " + BrandAndModel());
    }
    @Override
    public void printnfo(){
        System.out.println("Водитель " + getDriver() +
                " управляет грузовым автомобилем " + BrandAndModel() +
                " и будет участвовать в заезде");
    }

    @Override
    public void printType() {
        if (isNull(loadСapacityType)){
            System.out.println("Данных по транспортному средству недостаточно");
            return;
        }
        System.out.println(loadСapacityType);
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Диагностика грузовика " + BrandAndModel() + " пройдена");
    }
}
