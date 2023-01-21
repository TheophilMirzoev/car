import java.util.ArrayList;
import java.util.List;

public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity, Mechanic mechanic, DriverC driverC) {
        super(brand, model, engineVolume, mechanic, driverC);
        this.loadCapacity = loadCapacity;
    }
    public  enum LoadCapacity{N1(0f,3.5f),N2(3.6f,12.0f),N3(12.1f, 50f);
        float loadCapacityMin;
        float loadCapacityMax;
        LoadCapacity(float loadCapacityMin, float loadCapacityMax) {
            this.loadCapacityMin = loadCapacityMin;
            this.loadCapacityMax = loadCapacityMax;
        }

        @Override
        public String toString() {
            return "Грузоподъемность: " + N1.name() + " от " + N1.loadCapacityMin + " до " + N1.loadCapacityMax + " тонн"
                    + '/' +
             "Грузоподъемность: " + N2.name() + " от " + N2.loadCapacityMin + " до " + N2.loadCapacityMax + " тонн" +
                    '/'+
                    "Грузоподъемность: " + N3.name() + " от " + N3.loadCapacityMin + " до " + N3.loadCapacityMax + " тонн";
        }
    }

    private LoadCapacity loadCapacity;

    @Override
    public String getInfo() {
        return " марка " + getBrand() + " модель " + getModel()
                + " объем двигателя " + getEngineVolume() + " механик "
                + mechanic.getName() + " " + mechanic.getLastName()
                + " из компании " + mechanic.getCompany()
                + " водитель " + driver.getName() + " " + driver.getPatronymic() + " " + driver.getLastName();
    }


    @Override
    public void passDiagnostics() {
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }else System.out.println(loadCapacity.name() + " вместимость от " + loadCapacity.loadCapacityMin + " до " + loadCapacity.loadCapacityMax);
    }

    @Override
    public void startMoving() {
        super.startMoving();
    }

    public static void finishTheMovement() {
        System.out.println("водитель категории C заканчивает движение");
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

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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
    public String toString() {
        return super.toString();
    }
}
