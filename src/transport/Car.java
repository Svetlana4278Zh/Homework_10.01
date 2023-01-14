package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume; //объем двигателя в литрах
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean isSummerTires;

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
               boolean isSummerTires) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateCarEngineVolume(engineVolume);
        this.color = validateCarColor(color);
        this.productionYear = validateCarProductionYear(productionYear);
        this.productionCountry = validateCarParameters(productionCountry);
        this.transmission = validateCarParameters(transmission);
        this.bodyType = validateCarParameters(bodyType);
        this.registrationNumber = validateCarRegistrationNumber(registrationNumber);
        this.numberOfSeats = validateCarNumberOfSeats(numberOfSeats);
        this.isSummerTires = isSummerTires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
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

    public boolean isSummerTires() {
        return isSummerTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateCarEngineVolume(engineVolume);
    }

    public void setColor(String color) {
        this.color = validateCarColor(color);
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSummerTires(boolean summerTires) {
        isSummerTires = summerTires;
    }

    @Override
    public String toString() {
        return brand + ' ' + model + ", страна сборки - " + productionCountry +
                ", год выпуска - " + productionYear + ", цвет кузова - " + color +
                ", объем двигателя - " + engineVolume + " л." +
                ",\n коробка передач - " + transmission +
                ", тип кузова - " + bodyType +
                ", рег. номер - " + registrationNumber +
                ", количество пассажирских мест - " + numberOfSeats +
                ", летняя резина - " + isSummerTires;
    }

    public static String validateCarParameters(String value){
        if (value == null || value.isBlank()) {return "default";}
        return value;
    }
    public static String validateCarColor(String value) {
        if (value == null || value.isBlank()) {return "белый";}
        return value;
    }
    public static double validateCarEngineVolume(double value) {
        if (value <= 0){return 1.5;}
        return value;
    }
    public static int validateCarProductionYear(int value) {
        if (value <= 0){return 2000;}
        return value;
    }
    public static String validateCarRegistrationNumber(String value) {
        if (value.matches("[а,в,е,к,м,н,о,р,с,т,у,х]{1}[0-9]{3}[а,в,е,к,м,н,о,р,с,т,у,х]{2}[0-9]{3}")){
            return value;
        }
        return "Некорректный номер";
    }
    public static int validateCarNumberOfSeats(int value) {
        if (value <= 0){return 5;}
        return value;
    }
}
