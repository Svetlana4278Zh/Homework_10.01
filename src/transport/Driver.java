package transport;

import static transport.Validate.*;

public abstract class Driver {
    private String name;
    private Boolean hasDriverLicense;
    private int experience;

    public Driver(String name, Boolean hasDriverLicense, int experience) {
        this.name = validateName(name);
        this.hasDriverLicense = hasDriverLicense;
        this.experience = validateExperience(experience);
    }

    public String getName() {
        return name;
    }

    public Boolean getHasDriverLicense() {
        return hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setHasDriverLicense(Boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return name;
    }

    public void startMoving(){
        System.out.println(this + " начал движение");
    }
    public void stop(){
        System.out.println(this + " остановился");
    }
    public void refuelСar(){
        System.out.println(this + " заправляет автомобиль");
    }
}
