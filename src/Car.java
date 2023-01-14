public class Car {
    private String brand;
    private String model;
    private double engineVolume; //объем двигателя в литрах
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateCarEngineVolume(engineVolume);
        this.color = validateCarColor(color);
        this.productionYear = validateCarProductionYear(productionYear);
        this.productionCountry = validateCarParameters(productionCountry);
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

    @Override
    public String toString() {
        return brand + ' ' + model + ", страна сборки - " + productionCountry +
                ", год выпуска - " + productionYear + ", цвет кузова - " + color + ", объем двигателя - " + engineVolume + " л.";
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
}
