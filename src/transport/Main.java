package transport;

import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия","автомат","седан","а123а178",4,true,new Car.Key(true,false));
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия","автомат","седан","в118вк777",5,true,new Car.Key(true,true));
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия","","","ц545ен123",5,true,new Car.Key(true,true));
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея","","","",0,false,new Car.Key(true,true));
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея","","","в147от154",0,false,new Car.Key(true,true));
        Car car6 = new Car(null,"",0,null,0,"   ","","","",0,true,new Car.Key(false,false));
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
        car6.changTires(1);
        System.out.println(car6);
    }
}
