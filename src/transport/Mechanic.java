package transport;

import static transport.Validate.*;

public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = validateName(name);
        this.company = validateCarParameters(company);
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = validateName(name);
    }

    public void setCompany(String company) {
        this.company = validateCarParameters(company);
    }

    public <T extends Transport> void performMaintenance(T t){
        System.out.println(t.BrandAndModel() + ", обслуживает механик: " + name);
    }
    public <T extends Transport> void fixCar(T t){
        System.out.println(t.BrandAndModel() + ", ремонтирует механик: " + name);
    }

    @Override
    public String toString() {
        return name + ", " + company;
    }
}
