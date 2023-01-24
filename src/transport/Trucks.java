package transport;

public class Trucks extends Transport implements Competing{
    private DriverC driver;
    public Trucks(String brand, String model, double engineVolume,DriverC driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
    }

    public DriverC getDriver() {
        return driver;
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
}
