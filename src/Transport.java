public class Transport {

    protected String brand;
    protected String model;
    protected int year;
    protected String country;
    protected String color;
    protected int maxSpeed;


    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }


    public String getCountry() {
        return country;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        if (color == null || getColor().isEmpty() || getColor().isBlank()) {
            this.color = "не указан";
        }
    }
    public int getMaxSpeed() {
       return maxSpeed;
   }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        if (getMaxSpeed() <= 0) {
            this.maxSpeed = 50;
        }
    }


}


