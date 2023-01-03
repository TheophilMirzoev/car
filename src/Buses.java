public class Buses <T extends DriverD> extends Transport implements Competing{
    public Buses(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
}
