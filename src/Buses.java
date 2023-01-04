public class Buses extends Transport implements Competing{
    public Buses(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public enum Capacity{especially_small(0,10), small(11,39), average(40,59), big(60,99), especially_big(100,120);
        int min;
        int max;
        Capacity(int min, int max) {
            this.min = min;
            this.max = max;
        }
        @Override
        public String toString() {
            return "Вместимость " + especially_small.name() + " от " + especially_small.min + " до " + especially_small.max + " мест" + '/'
            +      "Вместимость " + small.name() + " от " + small.min + " до " + small.max + " мест" + '/'
            +      "Вместимость " + average.name() + " от " + average.min + " до " + average.max + " мест" + '/'
            +      "Вместимость " + big.name() + " от " + big.min + " до " + big.max + " мест" + '/'
            +      "Вместимость " + especially_big.name() + " от " + especially_big.min + " до " + especially_big.max + " мест";
        }
    }

    private Capacity capacity;

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }else System.out.println(capacity.name() + " вместимость от " + capacity.min + " до " + capacity.max);
    }

    @Override
    public void startMoving() {
        super.startMoving();
    }

    public static void finishTheMovement() {
        System.out.println("водитель категории D заканчивает движение");
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

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}
