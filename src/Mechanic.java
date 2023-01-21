import java.util.ArrayList;
import java.util.List;

public class Mechanic <E extends Transport>
{
    private String name;
    private String lastName;
    private String company;
    public Mechanic(String name, String lastName, String company) {
        this.name = name;
        this.lastName = lastName;
        this.company = company;
    }


    public String performMaintenance(E carName) {
       return  "Механик " + name + " " + lastName + " из компании " + company +
               " проводит техобслуживание автомобиля " + carName;
    }

    public void fixTheCar() {
    }

    @Override
    public String toString() {
        return "Механик " + name  + " " + lastName + " " + company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
