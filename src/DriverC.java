public class DriverC <T extends Truck> extends Driver {
    public DriverC(String name, String patronymic, String lastName, String driversLicense, int experience) throws RightsIssueException {
        super(name, patronymic, lastName, driversLicense, experience);
    }


    public void startMoving(T trucks) {
        System.out.println("Водитель " + getName() + " " + getPatronymic()
                + " " + getLastName() + " управляет автомобилем " + " " + trucks.getBrand() + " " + trucks.getModel());
    }

    public void stop() {
        System.out.println("водитель категории C заканчивает движение");
    }

    public void refuelTheCar() {
        System.out.println("заправляюсь");
    }

}
