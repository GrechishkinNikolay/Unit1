package unit2.Stationeries;

import java.util.Objects;

public abstract class Stationery {

    protected double price;
    protected String name;

    public Stationery(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stationery that = (Stationery) o;
        return Double.compare(that.price, price) == 0 &&
                name.equals(that.name);
    }

    @Override
    public String toString() {
        return "\nStationery{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
