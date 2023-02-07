package transport;
import java.util.*;

import static transport.Validate.*;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;
    private List<Mechanic> mechanics = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume,List<Mechanic> mechanics) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateCarEngineVolume(engineVolume);
        this.mechanics = mechanics;
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

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    @Override
    public String toString() {
        return BrandAndModel() + ", объем двигателя: " + engineVolume;
    }
    public void printListOfMechanics(){
        System.out.println("Список механиков для " + BrandAndModel() + ":");
        for(Mechanic mechanic : mechanics){
            System.out.println(mechanic);
        }
    }
    public String BrandAndModel(){
        return brand + " " + model;
    }

    public abstract void startMoving();
    public abstract void finishMoving();
    public abstract void printnfo();
    public abstract void printType();
    public abstract void passDiagnostics() throws TransportTypeException;
    public boolean checkTransportNeedService(){
        if (getClass() == Buses.class){
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(mechanics, transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, mechanics);
    }
}
