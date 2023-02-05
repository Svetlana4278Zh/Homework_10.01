package transport;

import java.util.*;

import static transport.BodyType.*;
import static transport.CapacityType.*;
import static transport.LoadСapacityType.*;

public class Main {
    public static void main(String[] args) throws TransportTypeException {
        //region drivers
        DriverB driverIvanov = new DriverB("Иванов Иван Иванович", true,3);
        DriverC driverSergeev = new DriverC("Сергеев Сергей Сергеевич",true,5);
        DriverD driverPetrov = new DriverD("Петров Петр Петрович",true,6);
        //endregion
        //region mechanics
        Mechanic mechanicSidorov = new Mechanic("Сидоров Иван","Company1");
        Mechanic mechanicRybin =new Mechanic("Рыбин Алексей","Company1");
        Mechanic mechanicLisin =new Mechanic("Лисин Андрей","Company2");
        Mechanic mechanicSerov =new Mechanic("Серов Иван","Company2");
        Mechanic mechanicKrasin =new Mechanic("Красин Матвей","Company3");
        Mechanic mechanicVasin =new Mechanic("Васин Егор","Company3");
        //endregion
        //region list of transports
        List<Transport> raceCars = new ArrayList<>();
        raceCars.add(new PassengerCars("Lada","Granta",1.7,List.of(mechanicSidorov,mechanicLisin),driverIvanov,SEDAN));
        raceCars.add(new PassengerCars("Audi","A8 50 L TDI quattro",3.0,List.of(mechanicKrasin,mechanicRybin),driverIvanov,SEDAN));
        raceCars.add(new PassengerCars("BMW","Z8",3.0,List.of(mechanicSidorov,mechanicKrasin),driverIvanov,SEDAN));
        raceCars.add(new PassengerCars("Kia","Sportage",2.4,List.of(mechanicSidorov),driverIvanov,CROSSOVER));
        raceCars.add(new Trucks("Mercedes-Benz","Actros",7.7,List.of(mechanicSerov),driverSergeev,N2));
        raceCars.add(new Trucks("Mercedes-Benz","Atego",5.1,List.of(mechanicSerov),driverSergeev,N2));
        raceCars.add(new Trucks("Nissan","Cabstar",3.0,List.of(mechanicSerov),driverSergeev,N3));
        raceCars.add(new Trucks("Ford","Cargo",7.3,List.of(mechanicSerov),driverSergeev,N2));
        raceCars.add(new Buses("Hyundai","Aero Express",12.9,List.of(mechanicSerov,mechanicVasin),driverPetrov,SMALL));
        raceCars.add(new Buses("Mercedes-Benz","Integro",12.0,List.of(mechanicVasin),driverPetrov,AVERAGE));
        raceCars.add(new Buses("Ikarus","435T",10.3,List.of(mechanicSerov,mechanicVasin),driverPetrov,AVERAGE));
        raceCars.add(new Buses("Mercedes-Benz","Tourismo",11.9,List.of(mechanicSerov),driverPetrov,LARGE));
        System.out.println(raceCars.get(0));
        System.out.println(raceCars.get(1));
        System.out.println(raceCars.get(2));
        System.out.println(raceCars.get(3));
        System.out.println(raceCars.get(4));
        System.out.println(raceCars.get(5));
        System.out.println(raceCars.get(6));
        System.out.println(raceCars.get(7));
        System.out.println(raceCars.get(8));
        System.out.println(raceCars.get(9));
        System.out.println(raceCars.get(10));
        System.out.println(raceCars.get(11));
        //endregionss
        System.out.println();
        raceCars.get(0).printnfo();
        raceCars.get(0).printListOfMechanics();
        System.out.println();
        raceCars.get(5).printnfo();
        raceCars.get(5).printListOfMechanics();
        System.out.println();
        raceCars.get(10).printnfo();
        raceCars.get(10).printListOfMechanics();
        System.out.println();
        raceCars.get(0).passDiagnostics();
        raceCars.get(5).passDiagnostics();
        raceCars.get(10).passDiagnostics();
        System.out.println();
        Queue<Transport> queue = new ArrayDeque<Transport>();
        queue.add(raceCars.get(0));
        ServiceStation serviceStation = new ServiceStation(queue);
        serviceStation.carryOutTechnicalInspection();
        serviceStation.carryOutTechnicalInspection();
        serviceStation.addCarToQueue(raceCars.get(1));
        serviceStation.addCarToQueue(raceCars.get(4));
        serviceStation.addCarToQueue(raceCars.get(10));
        serviceStation.addCarToQueue(raceCars.get(6));
        serviceStation.carryOutTechnicalInspection();
        raceCars.get(10).getMechanics().get(0).fixCar(raceCars.get(10));
    }
}
