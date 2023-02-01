package transport;
import static transport.Validate.*;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateCarEngineVolume(engineVolume);
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

    @Override
    public String toString() {
        return brand + " " + model + ", объем двигателя: " + engineVolume;
    }

    public abstract void startMoving();

    public abstract void finishMoving();
    public abstract void printnfo();
    public abstract void printType();
    public abstract void passDiagnostics();

}
