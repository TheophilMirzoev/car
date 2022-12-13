public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7d, "желтый", 2015, "Россия");
        Car car2 = new Car("Audi", "A8", 3.0d, "черный", 2020, "Германия");
        Car car3 = new Car("BMW", "Z8", 3.0d, "черный", 2021, "Германия");
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4d, "красный", 2018, "Южная Корея");
        Car car5 = new Car("Hyundai", "Avante", 1.6d, "оранжевый", 2016, "Южная Корея");

        car1.outputInformation();
        car2.outputInformation();
        car3.outputInformation();
        car4.outputInformation();
        car5.outputInformation();
    }
}