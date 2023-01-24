package transport;

public class Buses extends Transport implements Competing{
    private DriverD driver;
    public Buses(String brand, String model, double engineVolume,DriverD driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
    }

    public DriverD getDriver() {
        return driver;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " поехал");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " остановился");
    }

    @Override
    public void getPitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " на Пит-стопе");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга для автобуса " + getBrand() + " " + getModel());
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость автобуса " + getBrand() + " " + getModel());
    }

    @Override
    public void printnfo(){
        System.out.println("Водитель " + getDriver() +
                " управляет автобусом " + getBrand() + " " + getModel() +
                " и будет участвовать в заезде");
    }
}
