package transport;

import static transport.Validate.isNull;

public class PassengerCars extends Transport implements Competing {
    private DriverB driver;
    private BodyType bodyType;
    public PassengerCars(String brand, String model, double engineVolume,DriverB driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
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
    public void startMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " поехал");
    }

    @Override
    public void finishMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " остановился");
    }

    @Override
    public void getPitStop() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " на Пит-стопе");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга легкового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля " + getBrand() + " " + getModel());
    }
    @Override
    public void printnfo(){
        System.out.println("Водитель " + getDriver() +
                " управляет легковым автомобилем " + getBrand() + " " + getModel() +
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
        System.out.println("Диагностика автомобиля " + getBrand() + " " + getModel() + " пройдена");
    }
}
