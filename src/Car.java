import javax.swing.tree.DefaultTreeCellEditor;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    public  Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        if (brand == null || brand.isEmpty()) {
            this.brand = "не указана марка";
        }

        this.model = model;
        if (model == null || model.isEmpty()) {
            this.model = "не указана модель";
        }

        this.country = country;
        if (country == null || country.isEmpty()) {
            this.country = "нет страны";
        }

        this.engineVolume = engineVolume;
        if (engineVolume <=0) {
            this.engineVolume = 1.5d;
        }

        this.color = color;
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        }

        this.year = year;
        if (year <= 0) {
            this.year = 2000;
        }
    }
    void outputInformation() {
        System.out.println("Бренд " +  brand + ", модель " + model + ", объем двигателя " + engineVolume + ", цвет " +
                color + ", год выпуска " + year + ", страна производства " + country);
    }
}
