import java.time.LocalDate;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private final  String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String tires;

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
    String transmission, String bodyType, String registrationNumber, int numberOfSeats, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);

        this.engineVolume = engineVolume;
        if (engineVolume <=0) {
            this.engineVolume = 1.5d;
        }

        this.transmission = transmission;
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "не известно";
        }
        this.bodyType = bodyType;
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

//    void outputInformation() {
//        System.out.println("Бренд " +  brand + ", модель " + model + ", объем двигателя " + engineVolume + ", цвет " +
//                color + ", год выпуска " + year + ", страна производства " + country + ", коробка передач "
//                + transmission + ", максимальная скорость " + maxSpeed + ", количество мест " + numberOfSeats + ", номер "
//         + registrationNumber + ", тип кузова " + bodyType + ", резина " + tires);
//    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", tires='" + tires + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", color='" + getColor() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }

    public double getEngineVolume() {
        return engineVolume;
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
