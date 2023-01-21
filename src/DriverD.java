public class DriverD <T extends Bus> extends Driver{
    public DriverD(String name, String patronymic, String lastName, String driversLicense, int experience) throws RightsIssueException {
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

    @Override
    public void startMoving() {
        super.startMoving();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getPatronymic() {
        return super.getPatronymic();
    }

    @Override
    public void setPatronymic(String patronymic) {
        super.setPatronymic(patronymic);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getDriversLicense() {
        return super.getDriversLicense();
    }

    @Override
    public void setDriversLicense(String driversLicense) {
        super.setDriversLicense(driversLicense);
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    @Override
    public void setExperience(int experience) {
        super.setExperience(experience);
    }
}
