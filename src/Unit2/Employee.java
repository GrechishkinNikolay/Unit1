package Unit2;

import Unit2.Stationeries.Stationery;
import java.util.ArrayList;
import java.util.Objects;

public class Employee {

    private String name;
    private ArrayList<Stationery> stationeries;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, ArrayList<Stationery> stationeries) {
        this.name = name;
        this.stationeries = stationeries;
    }

    public double getPriceOfAllStationeries() {
        double price = 0;

        for (Stationery stationery : stationeries) {
            price += stationery.getPrice();
        }

        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Stationery> getStationeries() {
        return stationeries;
    }

    public void setStationeries(ArrayList<Stationery> stationeries) {
        this.stationeries = stationeries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) &&
                Objects.equals(stationeries, employee.stationeries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stationeries);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", stationeries=" + stationeries +
                '}';
    }
}
