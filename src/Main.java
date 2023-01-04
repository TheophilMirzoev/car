public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car("Lada", "Granta", 1.7d, "желтый", 2015, "Россия", "автомат", "седан", "у1234пр", 4, 4);
//        Car car2 = new Car("Audi", "A8", 3.0d, "черный", 2020, "Германия", "автомат", "седан", "у1234пр", 4, 67);
//        Car car3 = new Car("BMW", "Z8", 3.0d, "черный", 2021, "Германия", "автомат", "седан", "у1234пр", 4, 78);
//        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4d, "красный", 2018, "Южная Корея", "автомат", "седан", "у1234пр", 4, 90);
//        Car car5 = new Car("Hyundai", "Avante", 1.6d, "оранжевый", 2016, "Южная Корея", "автомат", "седан", "у1234пр", 4, 0);
//        Bus bus1 = new Bus("BMW", "qwerty", 2015, "Germany", "black", 160);
//        Bus bus2 = new Bus("volkswagen", "asd", 2013, "Germany", "pink", 140);
//        Bus bus3 = new Bus("rivian", "q10", 2021, "USA", "green", 250);
        PassengerCars cars1 = new PassengerCars("Audi", "A8", 3.0d, PassengerCars.BodyType.SEDAN);
        PassengerCars cars2 = new PassengerCars("BMW", "Z8", 3.0d, PassengerCars.BodyType.SEDAN);
        PassengerCars cars3 = new PassengerCars("Hyundai", "Avante", 1.6d, PassengerCars.BodyType.COUPE);
        PassengerCars cars4 = new PassengerCars("Lada", "Granta", 1.7d, PassengerCars.BodyType.CROSSOVER);
        Trucks trucks1 = new Trucks("MAN", "TGX 4×2", 4.0d, Trucks.LoadCapacity.N2);
        Trucks trucks2 = new Trucks("Volvo", "FE II", 5.0d, Trucks.LoadCapacity.N3);
        Trucks trucks3 = new Trucks("Ford", "Cargo", 6.0d, Trucks.LoadCapacity.N1);
        Trucks trucks4 = new Trucks("Scania", "S-Series", 6.8d, Trucks.LoadCapacity.N3);
        Buses buses1 = new Buses("Volvo", "8900", 7.8d, Buses.Capacity.average);
        Buses buses2 = new Buses("Volvo", "9900", 8.8d, Buses.Capacity.big);
        Buses buses3 = new Buses("Volvo", "9700", 6.8d, Buses.Capacity.small);
        Buses buses4 = new Buses("Volvo", "7900", 5.8d, Buses.Capacity.especially_big);
        DriverB driverB = new DriverB("Иван", "Иванович", "Иванов", "B", 3);
        DriverC driverC = new DriverC("Сергей", "Максимович", "Петров", "C", 4);
        DriverD driverD = new DriverD("Андрей", "Сергеевич", "Пушков", "D", 4);

        driverC.startMoving(trucks1);
        driverB.startMoving(cars2);
        driverD.startMoving(buses4);
//        System.out.println(PassengerCars.BodyType.STATION_WAGON.toString());
//        System.out.println(Trucks.LoadCapacity.N2.toString());
//        System.out.println(Buses.Capacity.average.toString());
       cars4.printType();
       buses1.printType();
       trucks1.printType();


}}