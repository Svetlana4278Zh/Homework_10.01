package transport;

import static transport.Validate.isNull;

public class Buses extends Transport implements Competing{
    private DriverD driver;
    private CapacityType capacityType;
    public Buses(String brand, String model, double engineVolume,DriverD driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
    }

    public DriverD getDriver() {
        return driver;
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(CapacityType capacityType) {
        this.capacityType = capacityType;
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

    @Override
    public void printType() {
        if (isNull(capacityType)){
            System.out.println("Данных по транспортному средству недостаточно");
            return;
        }
        System.out.println(capacityType);
    }
}
