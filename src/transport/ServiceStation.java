package transport;

import java.util.*;

public class ServiceStation {
    private Queue<Transport> queueOfCars;

    public ServiceStation(Queue<Transport> queueOfCars) {
        this.queueOfCars = queueOfCars;
    }
    public void addCarToQueue(Transport transport){
        if (transport.checkTransportNeedService()){
            queueOfCars.add(transport);
        } else {
            System.out.println("Автобусы не нуждаются в ТО, " +
                    transport.BrandAndModel() + " в очередь не добавлен");
        }
    }
    public void carryOutTechnicalInspection(){
        if (queueOfCars.isEmpty()){
            System.out.println("Очередь пуста");
        } else {
            while (!queueOfCars.isEmpty()){
                Transport currentTransport = queueOfCars.poll();
                List<Mechanic> mechanics = currentTransport.getMechanics();
                for (Mechanic mechanic : mechanics){
                    mechanic.performMaintenance(currentTransport);
                }
            }
        }
    }

    @Override
    public String toString() {
        return queueOfCars.toString();
    }
}
