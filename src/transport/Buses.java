package transport;

import java.util.List;
import java.util.Objects;

import static transport.Validate.isNull;

public class Buses extends Transport implements Competing{
    private DriverD driver;
    private CapacityType capacityType;
    public Buses(String brand, String model, double engineVolume, List<Mechanic> mechanics, DriverD driver, CapacityType capacityType) {
        super(brand, model, engineVolume,mechanics);
        this.driver = driver;
        this.capacityType = capacityType;
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
    public String toString() {
        return super.toString() + ", " + capacityType;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + BrandAndModel() + " поехал");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус " + BrandAndModel() + " остановился");
    }

    @Override
    public void getPitStop() {
        System.out.println("Автобус " + BrandAndModel() + " на Пит-стопе");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга для автобуса " + BrandAndModel());
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость автобуса " + BrandAndModel());
    }

    @Override
    public void printnfo(){
        System.out.println("Водитель " + getDriver() +
                " управляет автобусом " + BrandAndModel() +
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

    @Override
    public void passDiagnostics(){
        try {
            throw new TransportTypeException("Автобусы диагностику проходить не должны");
        } catch (TransportTypeException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Buses buses = (Buses) o;
        return Objects.equals(driver, buses.driver) && capacityType == buses.capacityType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), driver, capacityType);
    }
}
