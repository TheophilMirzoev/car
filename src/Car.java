import java.time.LocalDate;

public class Car {
    final String brand;
    final String model;
    double engineVolume;
    String color;
    final int year;
    final String country;
    String transmission;
    final  String bodyType;
    String registrationNumber;
    final int numberOfSeats;
    String tires;

    public class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {

            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = "некоректно";
            } else  {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessAccess == null || keylessAccess.isEmpty() || keylessAccess.isBlank()) {
                this.keylessAccess = "некоректно";
            } else {
                this.keylessAccess = keylessAccess;
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }


    }


    public void winterOrSummerTires() {
        if (LocalDate.now().getMonthValue() < 12 & LocalDate.now().getMonthValue() > 2) {
            this.tires = "Летняя";
            if (LocalDate.now().getMonthValue() < 12 & LocalDate.now().getMonthValue() > 9) {
                this.tires = tires + ", пора менять на зимнюю";
            }
        } else {
            this.tires = "Зимняя";
            if (LocalDate.now().getMonthValue() < 10 & LocalDate.now().getMonthValue() > 2) {
                this.tires = tires + ", пора менять на летнюю";
            }
        }
    }

    public  Car(String brand, String model, double engineVolume, String color, int year, String country,
    String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
        this.brand = brand;
//        if (brand == null || brand.isEmpty()) {
//            this.brand = "не указана марка";
//        }

        this.model = model;
//        if (model == null || model.isEmpty()) {
//            this.model = "не указана модель";
//        }

        this.country = country;
//        if (country == null || country.isEmpty()) {
//            this.country = "нет страны";
//        }

        this.engineVolume = engineVolume;
        if (engineVolume <=0) {
            this.engineVolume = 1.5d;
        }

        this.color = color;
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        }

        this.year = year;
//        if (year <= 0) {
//            this.year = 2000;
//        }

        this.transmission = transmission;
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "не известно";
        }
        this.bodyType = bodyType;
//        if (bodyType == null || bodyType.isEmpty()) {
//            this.bodyType = "не известно";
//        }
        this.registrationNumber = registrationNumber;
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "не известно";
        }

        this.numberOfSeats = numberOfSeats;
        if (numberOfSeats == 0 || numberOfSeats < 0 || numberOfSeats > 8) {
            this.registrationNumber = "не известно";
        }
        winterOrSummerTires();
        
    }
    void outputInformation() {
        System.out.println("Бренд " +  brand + ", модель " + model + ", объем двигателя " + engineVolume + ", цвет " +
                color + ", год выпуска " + year + ", страна производства - " + country +
                ", трансмиссия - " + transmission + ", тип кузова - " + bodyType + ", номер - "+ registrationNumber + ", количество мест - "
                + numberOfSeats + ", резина " + tires);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTires() {
        return tires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

}
