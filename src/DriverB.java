public class DriverB <T extends PassengerCars> extends Driver {
    public DriverB(String name, String patronymic, String lastName, String driversLicense, int experience) {
        super(name, patronymic, lastName, driversLicense, experience);
    }

    public void startMoving(T passengerCars) {
        System.out.println("Водитель " + getName() + " " + getPatronymic()
                + " " + getLastName() + " управляет автомобилем " + " " + passengerCars.getBrand() + " " + passengerCars.getModel());
    }

    public void stop() {
        System.out.println("водитель категории B заканчивает движение");
    }

    public void refuelTheCar() {
        System.out.println("заправляюсь");
    }



}
