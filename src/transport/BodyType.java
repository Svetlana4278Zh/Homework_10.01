package transport;

public enum BodyType {

    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");
    private String type;
    BodyType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + type;
    }
}
