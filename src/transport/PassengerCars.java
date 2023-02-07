package transport;

import java.util.List;
import java.util.Objects;

import static transport.Validate.isNull;

public class PassengerCars extends Transport implements Competing {
    private DriverB driver;
    private BodyType bodyType;
    public PassengerCars(String brand, String model, double engineVolume, List<Mechanic> mechanics, DriverB driver, BodyType bodyType) {
        super(brand, model, engineVolume, mechanics);
        this.driver = driver;
        this.bodyType = bodyType;
    }

    public DriverB getDriver() {
        return driver;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("Легковой автомобиль " + BrandAndModel() + " поехал");
    }

    @Override
    public void finishMoving() {
        System.out.println("Легковой автомобиль " + BrandAndModel() + " остановился");
    }

    @Override
    public void getPitStop() {
        System.out.println("Легковой автомобиль " + BrandAndModel() + " на Пит-стопе");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга легкового автомобиля " + BrandAndModel());
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля " + BrandAndModel());
    }
    @Override
    public void printnfo(){
        System.out.println("Водитель " + getDriver() +
                " управляет легковым автомобилем " + BrandAndModel() +
                " и будет участвовать в заезде");
    }

    @Override
    public void printType() {
        if (isNull(bodyType)){
            System.out.println("Данных по транспортному средству недостаточно");
            return;
        }
        System.out.println(bodyType);
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Диагностика автомобиля " + BrandAndModel() + " пройдена");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerCars that = (PassengerCars) o;
        return Objects.equals(driver, that.driver) && bodyType == that.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), driver, bodyType);
    }
}
