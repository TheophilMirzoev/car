public class DriverB <T extends Transport > extends Driver {
    public DriverB(String name, String patronymic, String lastName, String driversLicense, int experience) {
        super(name, patronymic, lastName, driversLicense, experience);
    }

    @Override
    public void startMoving() {
        super.startMoving();
    }

    public void stop() {
        System.out.println("водитель категории B заканчивает движение");
    }

    public void refuelTheCar() {
        System.out.println("заправляюсь");
    }



}
