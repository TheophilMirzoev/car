import java.util.*;

 public class ServiceStation  {
     private  List <Transport> transportList = new LinkedList();
     private Deque<Transport> transportDeque = new LinkedList<>();

     public ServiceStation(List<Transport> listOfCars) {
         this.transportList = listOfCars;
     }

     public void addCarToQueue(Transport transport) {
         transportDeque.add(transport);
         System.out.println(transport + " транспортное средство добавлено в очередь");
     }

     public void getTechnicalInspectionOfTheCar() {
         transportDeque.removeFirst();
         System.out.println("техобслуживание пройдено ");
     }


     public List<Transport> getTransportList() {
         return transportList;
     }

     public Deque<Transport> getTransportDeque() {
         return transportDeque;
     }
 }



