package transport;

public class Validate {
    public static String validateCarParameters(String value){
        if (value == null || value.isBlank()) {return "default";}
        return value;
    }
    public static String validateCarColor(String value) {
        if (value == null || value.isBlank()) {return "белый";}
        return value;
    }
    public static String validateCarTransmission(String value){
        if (value == null || value.isBlank()) {return "автомат";}
        return value;
    }
    public static String validateCarBodyType(String value){
        if (value == null || value.isBlank()) {return "седан";}
        return value;
    }
    public static double validateCarEngineVolume(double value) {
        if (value <= 0){return 1.5;}
        return value;
    }
    public static int validateCarProductionYear(int value) {
        if (value <= 0){return 2000;}
        return value;
    }
    public static String validateCarRegistrationNumber(String value) {
        if (value.matches("[а,в,е,к,м,н,о,р,с,т,у,х]{1}[0-9]{3}[а,в,е,к,м,н,о,р,с,т,у,х]{2}[0-9]{3}")){
            return value;
        }
        return "Некорректный номер";
    }
    public static int validateCarNumberOfSeats(int value) {
        if (value <= 0){return 5;}
        return value;
    }
    public static double validateMaxSpeed(double value){
        if (value <= 0){
            return 120;
        }
        return value;
    }
}
