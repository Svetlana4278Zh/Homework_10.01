package transport;
import static transport.Validate.*;

public class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private double maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.productionYear = validateCarProductionYear(productionYear);
        this.productionCountry = validateCarParameters(productionCountry);
        this.color = validateCarColor(color);
        this.maxSpeed = validateMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = validateCarColor(color);
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = validateMaxSpeed(maxSpeed);
    }
}
