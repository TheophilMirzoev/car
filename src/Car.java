import javax.swing.tree.DefaultTreeCellEditor;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public  Car(String brand, String model, double engineVolume, String color, int year, String country) {

        if (brand != null && brand != "") {
            this.brand = brand;
        } else if (brand == null || brand == "") {
            this.brand = "не указана марка";
        }
        if (model != null && model != "") {
            this.model = model;
        } else if (model == null || model == "") {
            this.model = "не указана модель";
        }

        if (country != null && country != "") {
            this.country = country;
        } else if (country == null || country == "") {
            this.country = "нет страны";
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else if (engineVolume <=0) {
            this.engineVolume = 1.5d;
        }
        if (color != null && color != "") {
            this.color = color;
        } else if (color == null || color == "") {
            this.color = "белый";
        }
        if (year > 0) {
            this.year = year;
        } else if (this.year <= 0) {
            this.year = 2000;
        }
    }
    void outputInformation() {
        System.out.println("Бренд " +  brand + ", модель " + model + ", объем двигателя " + engineVolume + ", цвет " +
                color + ", год выпуска " + year + ", страна производства " + country);
    }

}
