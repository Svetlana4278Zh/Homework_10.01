package transport;

import static transport.Validate.isNull;

public enum CapacityType {
    ESPECIALLY_SMALL(null,10),
    SMALL(null,25),
    AVERAGE(40,50),
    LARGE(60,80),
    ESPECIALLY_BIG(100,120);
    private Integer min;
    private Integer max;

    CapacityType(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        if (isNull(min)){
            return "Вместимость: до " + max + " мест";
        } else if (isNull(max)){
            return "Вместимость: больше " + min + " мест";
        } else {
            return "Вместимость: " + min + " - " + max + " мест";
        }
    }
}
