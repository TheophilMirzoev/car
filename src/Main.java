import java.util.*;

public class Main {

    public static void main(String[] args) throws RightsIssueException {
        List<Mechanic> mechanicList = new ArrayList<>();
        mechanicList.add(0, new Mechanic<>("Иван", "Сергеев", "механик.ру"));
        mechanicList.add(1, new Mechanic<>("Сергей", "Миронов", "механик.ру"));
        mechanicList.add(2, new Mechanic<>("Иван", "Васильев", "механик.ру"));
        mechanicList.add(3, new Mechanic<>("Иван", "Петров", "механик.ру"));
        mechanicList.add(4, new Mechanic<>("Иван", "Лебедев", "механик.ру"));

        List<DriverD> driverListD = new ArrayList<>();
        driverListD.add(0, new DriverD("Андрей", "Сергеевич", "Пушков", "D", 4));

        List<DriverB> driverListB = new ArrayList<>();
        driverListB.add(0, new DriverB("Иван", "Иванович", "Иванов", "B", 3));

        List<DriverC> driverListC = new ArrayList<>();
        driverListC.add(0, new DriverC("Сергей", "Максимович", "Петров", "C", 4));

        List<Transport> listOfCars = new ArrayList<>();
        listOfCars.add(0, new PassengerCar<>("Audi", "A8", 3.0d, PassengerCar.BodyType.SEDAN, mechanicList.get(0), driverListB.get(0)));
        listOfCars.add(1, new PassengerCar<>("BMW", "Z8", 3.0d, PassengerCar.BodyType.SEDAN, mechanicList.get(1), driverListB.get(0)));
        listOfCars.add(2, new PassengerCar<>("Hyundai", "Avante", 1.6d, PassengerCar.BodyType.COUPE, mechanicList.get(2), driverListB.get(0)));
        listOfCars.add(3, new PassengerCar<>("Lada", "Granta", 1.7d, PassengerCar.BodyType.CROSSOVER, mechanicList.get(3), driverListB.get(0)));
        listOfCars.add(4, new Bus("Volvo", "8900", 7.8d, Bus.Capacity.average, mechanicList.get(4), driverListD.get(0)));
        listOfCars.add(5, new Bus("Volvo", "9900", 8.8d, Bus.Capacity.big, mechanicList.get(1), driverListD.get(0)));
        listOfCars.add(6, new Bus("Volvo", "9700", 6.8d, Bus.Capacity.small, mechanicList.get(3), driverListD.get(0)));
        listOfCars.add(7, new Bus("Volvo", "7900", 5.8d, Bus.Capacity.especially_big, mechanicList.get(2), driverListD.get(0)));
        listOfCars.add(8, new Truck("MAN", "TGX 4×2", 4.0d, Truck.LoadCapacity.N2, mechanicList.get(0), driverListC.get(0)));
        listOfCars.add(9, new Truck("Volvo", "FE II", 5.0d, Truck.LoadCapacity.N3, mechanicList.get(4), driverListC.get(0)));
        listOfCars.add(10, new Truck("Ford", "Cargo", 6.0d, Truck.LoadCapacity.N1, mechanicList.get(1), driverListC.get(0)));
        listOfCars.add(11, new Truck("Scania", "S-Series", 6.8d, Truck.LoadCapacity.N3, mechanicList.get(2), driverListC.get(0)));

        System.out.println(listOfCars.get(0).getInfo());
        System.out.println(listOfCars.get(4).getInfo());
        System.out.println(listOfCars.get(9).getInfo());

        ServiceStation serviceStationQueue = new ServiceStation(listOfCars);
        serviceStationQueue.addCarToQueue(listOfCars.get(0));
        serviceStationQueue.addCarToQueue(listOfCars.get(1));
        serviceStationQueue.addCarToQueue(listOfCars.get(2));
        serviceStationQueue.addCarToQueue(listOfCars.get(3));
        serviceStationQueue.addCarToQueue(listOfCars.get(8));
        serviceStationQueue.addCarToQueue(listOfCars.get(9));
        serviceStationQueue.addCarToQueue(listOfCars.get(10));
        serviceStationQueue.addCarToQueue(listOfCars.get(11));

        System.out.println(serviceStationQueue.getTransportDeque());
        serviceStationQueue.getTechnicalInspectionOfTheCar();
        System.out.println(serviceStationQueue.getTransportDeque());




        





    }
}