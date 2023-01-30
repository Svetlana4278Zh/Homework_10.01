package transport;

import static transport.Validate.isNull;

public enum LoadСapacityType {
    N1(null,3.5f),
    N2(3.5f,12f),
    N3(12f,null);
    private Float min;
    private Float max;

    LoadСapacityType(Float min, Float max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        if (isNull(min)){
            return "Грузоподъемность: до " + max + " тонн";
        } else if (isNull(max)){
            return "Грузоподъемность: свыше " + min + " тонн";
        } else {
            return "Грузоподъемность: от " + min + " тонн, до " + max + " тонн";
        }
    }
}
