package transport;

import static transport.Validate.isNull;

public class Trucks extends Transport implements Competing{
    private DriverC driver;
    private LoadСapacityType loadСapacityType;
    public Trucks(String brand, String model, double engineVolume,DriverC driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
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
    public void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " поехал");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " остановился");
    }

    @Override
    public void getPitStop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " на Пит-стопе");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга грузового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля " + getBrand() + " " + getModel());
    }
    @Override
    public void printnfo(){
        System.out.println("Водитель " + getDriver() +
                " управляет грузовым автомобилем " + getBrand() + " " + getModel() +
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
}
