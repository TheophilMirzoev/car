import java.util.ArrayList;
import java.util.Objects;

public class PassengerCar<B extends DriverB> extends Transport  implements Competing  {
    public PassengerCar(String brand, String model, double engineVolume, BodyType bodyType, Mechanic mechanic, DriverB driverB ) {
        super(brand, model, engineVolume, mechanic, driverB);
        this.bodyType = bodyType;
    }

    public enum BodyType {
        SEDAN("седан"), HATCHBACK("хетчбэк"), COUPE("купе"), STATION_WAGON("универсал"),
        OFF_ROAD_VEHICLE("внедорожник"), CROSSOVER("кроссовер"),
        PICKUP_TRUCK("пикап"), VAN("фургон"), MINIVAN("минивэн");

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }
        String bodyType;
        @Override
        public String toString() {
            return "Тип кузова " + bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }
    }

    private BodyType bodyType;

    @Override
    public String getInfo() {
        return " марка " + getBrand() + " модель " + getModel()
                    + " объем двигателя " + getEngineVolume() + " механик "
                    + mechanic.getName() + " " + mechanic.getLastName()
                    + " из компании " + mechanic.getCompany()
                + " водитель " + driver.getName() + " " + driver.getPatronymic() + " " + driver.getLastName();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void passDiagnostics(){
        super.passDiagnostics();
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }else System.out.println(bodyType);
    }

    @Override
    public void startMoving() {
        super.startMoving();
    }

    public static void finishTheMovement() {
        System.out.println("водитель категории B заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("пит стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("лучшее время");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("максимальная скорость");
    }


    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public double getEngineVolume() {
        return super.getEngineVolume();
    }

    @Override
    public void setEngineVolume(double engineVolume) {
        super.setEngineVolume(engineVolume);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerCar<?> that = (PassengerCar<?>) o;
        return bodyType == that.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyType);
    }
}
