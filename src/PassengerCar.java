public class PassengerCar extends Transport  implements Competing  {

    public PassengerCar(String brand, String model, double engineVolume, BodyType bodyType) {
       super(brand, model, engineVolume);
       this.bodyType= bodyType;
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
}
