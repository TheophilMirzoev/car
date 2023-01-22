import java.util.*;

public class Main {

    public static void main(String[] args) throws RightsIssueException {
        List<DriverD> driverListD = new ArrayList<>();
        driverListD.add(0, new DriverD("Андрей", "Сергеевич", "Пушков", "D", 4));

        List<DriverB> driverListB = new ArrayList<>();
        driverListB.add(0, new DriverB("Иван", "Иванович", "Иванов", "B", 3));

        List<DriverC> driverListC = new ArrayList<>();
        driverListC.add(0, new DriverC("Сергей", "Максимович", "Петров", "C", 4));

        Map<String, Mechanic> mechanicMap = new HashMap<>();
        List<Transport> listOfCars = new ArrayList<>();

        mechanicMap.put("audi", new Mechanic<>("Сергей", "Стефко", "механик.ру"));
        mechanicMap.put("bmw", new Mechanic<>("Сергей", "Миронов", "механик.ру"));
        mechanicMap.put("hyundai", new Mechanic<>("Алексей", "Васильев", "механик.ру"));
        mechanicMap.put("lada", new Mechanic<>("Иван", "Петров", "механик.ру"));
        mechanicMap.put("volvo 8900", new Mechanic<>("Федор", "Лебедев", "механик.ру"));
        mechanicMap.put("volvo 9900", new Mechanic<>("Андрей", "Сергеев", "механик.ру"));
        mechanicMap.put("volvo 9700", new Mechanic<>("Александр", "Миронов", "механик.ру"));
        mechanicMap.put("volvo 7900", new Mechanic<>("Владимир", "Васильев", "механик.ру"));
        mechanicMap.put("man", new Mechanic<>("Егор", "Петров", "механик.ру"));
        mechanicMap.put("volvo fe", new Mechanic<>("Георгий", "Лебедев", "механик.ру"));
        mechanicMap.put("ford", new Mechanic<>("Лев", "Сергеев", "механик.ру"));
        mechanicMap.put("scania", new Mechanic<>("Артем", "Сергеев", "механик.ру"));

        listOfCars.add(0, new PassengerCar<>("Audi", "A8", 3.0d, PassengerCar.BodyType.SEDAN, mechanicMap.get("audi"), driverListB.get(0)));
        listOfCars.add(1, new PassengerCar<>("BMW", "Z8", 3.0d, PassengerCar.BodyType.SEDAN, mechanicMap.get("bmw"), driverListB.get(0)));
        listOfCars.add(2, new PassengerCar<>("Hyundai", "Avante", 1.6d, PassengerCar.BodyType.COUPE, mechanicMap.get("hyundai"), driverListB.get(0)));
        listOfCars.add(3, new PassengerCar<>("Lada", "Granta", 1.7d, PassengerCar.BodyType.CROSSOVER, mechanicMap.get("lada"), driverListB.get(0)));
        listOfCars.add(4, new Bus("Volvo", "8900", 7.8d, Bus.Capacity.average, mechanicMap.get("volvo 8900"), driverListD.get(0)));
        listOfCars.add(5, new Bus("Volvo", "9900", 8.8d, Bus.Capacity.big, mechanicMap.get("volvo 9900"), driverListD.get(0)));
        listOfCars.add(6, new Bus("Volvo", "9700", 6.8d, Bus.Capacity.small, mechanicMap.get("volvo 9700"), driverListD.get(0)));
        listOfCars.add(7, new Bus("Volvo", "7900", 5.8d, Bus.Capacity.especially_big, mechanicMap.get("volvo 7900"), driverListD.get(0)));
        listOfCars.add(8, new Truck("MAN", "TGX 4×2", 4.0d, Truck.LoadCapacity.N2, mechanicMap.get("man"), driverListC.get(0)));
        listOfCars.add(9, new Truck("Volvo", "FE II", 5.0d, Truck.LoadCapacity.N3, mechanicMap.get("volvo fe"), driverListC.get(0)));
        listOfCars.add(10, new Truck("Ford", "Cargo", 6.0d, Truck.LoadCapacity.N1, mechanicMap.get("ford"), driverListC.get(0)));
        listOfCars.add(11, new Truck("Scania", "S-Series", 6.8d, Truck.LoadCapacity.N3, mechanicMap.get("scania"), driverListC.get(0)));

//        ServiceStation serviceStationQueue = new ServiceStation(listOfCars);
//        serviceStationQueue.addCarToQueue(listOfCars.get(0));
//        serviceStationQueue.addCarToQueue(listOfCars.get(1));
//        serviceStationQueue.addCarToQueue(listOfCars.get(2));
//        serviceStationQueue.addCarToQueue(listOfCars.get(3));
//        serviceStationQueue.addCarToQueue(listOfCars.get(8));
//        serviceStationQueue.addCarToQueue(listOfCars.get(9));
//        serviceStationQueue.addCarToQueue(listOfCars.get(10));
//        serviceStationQueue.addCarToQueue(listOfCars.get(11));
//
//        System.out.println(serviceStationQueue.getTransportDeque());
//        serviceStationQueue.getTechnicalInspectionOfTheCar();
//        System.out.println(serviceStationQueue.getTransportDeque());


        System.out.println(listOfCars.get(0).getInfo());
        System.out.println(listOfCars.get(4).getInfo());
        System.out.println(listOfCars.get(9).getInfo());
        System.out.println(mechanicMap.get("audi"));




        





    }
}