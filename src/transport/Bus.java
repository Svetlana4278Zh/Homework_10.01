package transport;

public class Bus extends Transport {
    public Bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               double maxSpeed){
        super(brand,model,productionYear,productionCountry,color,maxSpeed);
    }

    @Override
    public String toString() {
        return getBrand() + ' ' + getModel() +
                ", год выпуска - " + getProductionYear() +
                ", страна сборки - " + getProductionCountry() +
                ", цвет кузова - " + getColor() +
                ", максимальная скорость - " + getMaxSpeed() + " км/ч";
    }
}
