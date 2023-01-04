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
        PassengerCar cars1 = new PassengerCar("Audi", "A8", 3.0d, PassengerCar.BodyType.SEDAN);
        PassengerCar cars2 = new PassengerCar("BMW", "Z8", 3.0d, PassengerCar.BodyType.SEDAN);
        PassengerCar cars3 = new PassengerCar("Hyundai", "Avante", 1.6d, PassengerCar.BodyType.COUPE);
        PassengerCar cars4 = new PassengerCar("Lada", "Granta", 1.7d, PassengerCar.BodyType.CROSSOVER);
        Truck truck1 = new Truck("MAN", "TGX 4×2", 4.0d, Truck.LoadCapacity.N2);
        Truck truck2 = new Truck("Volvo", "FE II", 5.0d, Truck.LoadCapacity.N3);
        Truck truck3 = new Truck("Ford", "Cargo", 6.0d, Truck.LoadCapacity.N1);
        Truck truck4 = new Truck("Scania", "S-Series", 6.8d, Truck.LoadCapacity.N3);
        Bus bus1 = new Bus("Volvo", "8900", 7.8d, Bus.Capacity.average);
        Bus bus2 = new Bus("Volvo", "9900", 8.8d, Bus.Capacity.big);
        Bus bus3 = new Bus("Volvo", "9700", 6.8d, Bus.Capacity.small);
        Bus bus4 = new Bus("Volvo", "7900", 5.8d, Bus.Capacity.especially_big);
        DriverB driverB = new DriverB("Иван", "Иванович", "Иванов", "B", 3);
        DriverC driverC = new DriverC("Сергей", "Максимович", "Петров", "C", 4);
        DriverD driverD = new DriverD("Андрей", "Сергеевич", "Пушков", "D", 4);

        driverC.startMoving(truck1);
        driverB.startMoving(cars2);
        driverD.startMoving(bus4);
//        System.out.println(PassengerCar.BodyType.STATION_WAGON.toString());
//        System.out.println(Truck.LoadCapacity.N2.toString());
//        System.out.println(Bus.Capacity.average.toString());
       cars4.printType();
       bus1.printType();
       truck1.printType();


}}