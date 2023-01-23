package transport;

import static transport.Validate.*;

public class Car extends Transport {
    private double engineVolume; //объем двигателя в литрах
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean isSummerTires;
    private final Key key;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean isSummerTires,
               Key key) {
        super(brand,model,productionYear,productionCountry,color,0);
        this.engineVolume = validateCarEngineVolume(engineVolume);
        this.transmission = validateCarTransmission(transmission);
        this.bodyType = validateCarBodyType(bodyType);
        this.registrationNumber = validateCarRegistrationNumber(registrationNumber);
        this.numberOfSeats = validateCarNumberOfSeats(numberOfSeats);
        this.isSummerTires = isSummerTires;
        this.key = key;
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean getIsSummerTires() {
        return isSummerTires;
    }
    public Key getKey(){
        return key;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateCarEngineVolume(engineVolume);
    }

    public void setTransmission(String transmission) {
        this.transmission = validateCarTransmission(transmission);
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validateCarRegistrationNumber(registrationNumber);
    }

    public void setSummerTires(boolean isSummerTires) {
        this.isSummerTires = isSummerTires;
    }

    @Override
    public String toString() {
        return getBrand() + ' ' + getModel() + ", страна сборки - " + getProductionCountry() +
                ", год выпуска - " + getProductionYear() +
                ",\n\t цвет кузова - " + getColor() +
                ",\n\t объем двигателя - " + engineVolume + " л." +
                ",\n\t коробка передач - " + transmission +
                ",\n\t тип кузова - " + bodyType +
                ",\n\t рег. номер - " + registrationNumber +
                ",\n\t количество пассажирских мест - " + numberOfSeats +
                ",\n\t " + ((isSummerTires)? "летняя резина" : "зимняя резина") +
                ",\n\t " + key;
    }


    public void changTires(int month){
        if (month >= 4 && month <= 10){
            this.isSummerTires = true;
            return;
        }
        this.isSummerTires = false;
    }
    public static class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return "удаленный запуск двигателя - " + (remoteEngineStart ? "есть" : "нет") +
                    ", бесключевой доступ - " + (keylessAccess ? "есть" : "нет");
        }
    }
}
