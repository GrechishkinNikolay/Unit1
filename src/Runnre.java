import ExampleWildcards.*;

public class Runnre {

    public static void main(String args[]) {
        Garage<Car> garage = new Garage<>();
        garage.set(new Car("Aston Martin"));
        Car car = (Car) garage.get();
        System.out.println(car.getName()); // Aston Martin

        Garage<Motorcycle> garage2 = new Garage<>();
        garage2.set(new Motorcycle("Honda CBR500R"));
        Motorcycle motorcycle = (Motorcycle) garage2.get();
        System.out.println(motorcycle.getName());

    }
}
