public abstract class Transport  {

    private String brand;
    private String model;
    private double engineVolume;
    // private int year;
    // private String country;
   //  private String color;
   // private int maxSpeed;


    public  Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
//        this.year = year;
//        this.country = country;
//        this.color = color;
//        this.maxSpeed = maxSpeed;

    }

    public void passDiagnostics() {
    }


    public void startMoving() {
        System.out.println(brand + " " + model);
    }
    public static void finishTheMovement() {

    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
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
    public abstract void printType();


    //    public int getYear() {
//        return year;
//    }
//
//
//    public String getCountry() {
//        return country;
//    }
//
//
//    public String getColor() {
//        return color;
//    }

//    public void setColor(String color) {
//        if (color == null || color.isEmpty() || color.isBlank()) {
//            this.color = "не указан";
//        } else {this.color = color;}
//    }
//    public int getMaxSpeed() {
//       return maxSpeed;
//   }

//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed <= 0) {
//            this.maxSpeed = 50;
//        } else {this.maxSpeed = maxSpeed;}
//    }


}


