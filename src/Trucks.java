public class Trucks extends Transport implements Competing{
    public Trucks(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
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
}
