import java.util.ArrayList;

public abstract class Transport <B extends Driver>{
    private String brand;
    private String model;
    private double engineVolume;
    protected Mechanic mechanic;
    protected Driver driver;



    public  Transport(String brand, String model, double engineVolume, Mechanic mechanic, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.mechanic = mechanic;
        this.driver = driver;

    }


    public void passDiagnostics() {
    }

    public abstract String getInfo();

    public void startMoving() {
        System.out.println(brand + " " + model);
    }
    public static void finishTheMovement() {
    }
    public abstract void printType();

    @Override
    public String toString() {
        return  "марка " + brand + " модель " + model
                + " объем двигателя " + engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "не известно";
        } else {this.brand = brand;}
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.brand = "не известно";
        } else {this.model = model;}

    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <=0) {
            this.engineVolume = 1.5d;
        }else this.engineVolume = engineVolume;
    }

}


