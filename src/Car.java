public class Car {
    private String brand;
    private String model;
    private double engineVolume; //объем двигателя в литрах
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (isEmptyString(brand)){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (isEmptyString(model)){
            this.model = "default";
        } else {
            this.model = model;
        }
        if (isNotPositiveNumber(engineVolume)){
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (isEmptyString(color)){
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (isNotPositiveNumber(productionYear)){
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (isEmptyString(productionCountry)){
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
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

    public static boolean isEmptyString(String str){
        if (str == null || str == ""){
            return true;
        }
        return false;
    }
    public static boolean isNotPositiveNumber(double number) {
        if (number <= 0){
            return true;
        }
        return false;
    }
}
