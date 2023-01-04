public class DriverD <T extends Bus> extends Driver{
    public DriverD(String name, String patronymic, String lastName, String driversLicense, int experience) {
        super(name, patronymic, lastName, driversLicense, experience);
    }

    public void startMoving(T buses) {
        System.out.println("Водитель " + getName() + " " + getPatronymic()
                + " " + getLastName() + " управляет автомобилем " + " " + buses.getBrand() + " " + buses.getModel());
    }

    public void stop() {
        System.out.println("водитель категории D заканчивает движение");
    }

    public void refuelTheCar() {
        System.out.println("заправляюсь");
    }

}
