package transport;

public class Main {
    public static void main(String[] args) {
        DriverB driver1 = new DriverB("Иванов Иван Иванович", true,3);
        DriverC driver2 = new DriverC("Сергеев Сергей Сергеевич",true,5);
        DriverD driver3 = new DriverD("Петров Петр Петрович",true,6);
        PassengerCars car1 = new PassengerCars("Lada","Granta",1.7,driver1);
        PassengerCars car2 = new PassengerCars("Audi","A8 50 L TDI quattro",3.0,driver1);
        PassengerCars car3 = new PassengerCars("BMW","Z8",3.0,driver1);
        PassengerCars car4 = new PassengerCars("Kia","Sportage",2.4,driver1);
        Trucks truck1 = new Trucks("Mercedes-Benz","Actros",7.7,driver2);
        Trucks truck2 = new Trucks("Mercedes-Benz","Atego",5.1,driver2);
        Trucks truck3 = new Trucks("Nissan","Cabstar",3.0,driver2);
        Trucks truck4 = new Trucks("Ford","Cargo",7.3,driver2);
        Buses bus1 = new Buses("Hyundai","Aero Express",12.9,driver3);
        Buses bus2 = new Buses("Mercedes-Benz","Integro",12.0,driver3);
        Buses bus3 = new Buses("Ikarus","435T",10.3,driver3);
        Buses bus4 = new Buses("Mercedes-Benz","Tourismo",11.9,driver3);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
        car1.printnfo();
        truck2.printnfo();
        bus3.printnfo();
    }
}
