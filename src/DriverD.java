public class DriverD extends Driver{
    public DriverD(String name, String patronymic, String lastName, String driversLicense, int experience) {
        super(name, patronymic, lastName, driversLicense, experience);
    }

    @Override
    public void startMoving() {
        super.startMoving();
    }

    public void stop() {
        System.out.println("водитель категории D заканчивает движение");
    }

    public void refuelTheCar() {
        System.out.println("заправляюсь");
    }

}
