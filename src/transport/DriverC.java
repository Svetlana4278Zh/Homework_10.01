package transport;

public class DriverC extends Driver{
    public DriverC(String name, Boolean hasDriverLicense, int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
