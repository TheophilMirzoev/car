import java.util.Objects;

public class Driver {
    private String name;
    private String patronymic;
    private String lastName;
    private String driversLicense;
    private int experience;

    public Driver(String name, String patronymic, String lastName, String driversLicense, int experience) throws RightsIssueException {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
        try {
            if (driversLicense != null || !driversLicense.isEmpty() || !driversLicense.isBlank()) {
                this.driversLicense = driversLicense;
        }} catch (Exception e) {
            throw new RightsIssueException("Необходимо указать тип прав!");
        }
        this.experience = experience;
    }

    public void startMoving() {
        System.out.println("Водитель " + name + " " + patronymic + " " + lastName + " управляет автомобилем");
    }

    public void stop() {

    }
    public void refuelTheCar() {

    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", lastName='" + lastName + '\'' +
                ", driversLicense='" + driversLicense + '\'' +
                ", experience=" + experience +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "default";
        } else this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        if (patronymic == null || patronymic.isEmpty() || patronymic.isBlank()) {
            this.patronymic = "default";
        } else this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty() || lastName.isBlank()) {
            this.lastName = "default";
        } else this.lastName = lastName;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        if (driversLicense == null || driversLicense.isEmpty() || driversLicense.isBlank()) {
            this.driversLicense = "default";
        } else this.driversLicense = driversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            this.experience = Math.abs(experience);
        } else this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && Objects.equals(name, driver.name) && Objects.equals(patronymic, driver.patronymic) && Objects.equals(lastName, driver.lastName) && Objects.equals(driversLicense, driver.driversLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, patronymic, lastName, driversLicense, experience);
    }
}
