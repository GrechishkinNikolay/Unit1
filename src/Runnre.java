import ExampleWildcards.*;
import java.util.ArrayList;
import java.util.List;

public class Runnre {

    public static void main(String args[]) {
/*        Car CAR = new Car("Aston Martin");
        Motorcycle MOTORCYCLE = new Motorcycle("Honda CBR500R");
        Truck TRUCK = new Truck("Road Kill");

        TripleGarage<Car, Motorcycle, Truck> garage1 = new TripleGarage<>();
        garage1.set1(CAR);
        garage1.set2(MOTORCYCLE);
        garage1.set3(TRUCK);

        TripleGarage<Car, Motorcycle, Truck> garage2 = new TripleGarage<>();
        garage2.set1(TRUCK);
        garage2.set2(MOTORCYCLE);
        garage2.set3(TRUCK);
        Car car1 = garage2.get1();
        Truck truck1 = (Truck) garage2.get1();

        TripleGarage<Car, Car, Car> garage3 = new TripleGarage<>();
        garage3.set1(CAR);
        garage3.set2(CAR);
        garage3.set3(CAR);*/
/*        FixedSizedGarage<Car> garage = new FixedSizedGarage<>(2);
        garage.set(0, new Car("Aston Martin"));
        garage.set(1, new Car("Audi"));
        Car car1 = garage.get(0);
        Car car2 = garage.get(1);*/
/*        DynamicSizedGarage<Motorcycle> garage = new DynamicSizedGarage<>();
        garage.add(new Motorcycle("Honda CBR500R"));
        garage.add(new Motorcycle("Harley-Davidson"));
        Motorcycle motorcycle1 = garage.get(0);
        Motorcycle motorcycle2 = garage.get(1);*/
/*        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota"));
        cars.add(new Car("Jaguar"));
        cars.add(new Car("BMW"));

        DynamicSizedGarage<Car> garage = new DynamicSizedGarage<>();
        garage.add(new Car("Aston Martin"));
        garage.addAll(cars);*/
/*      DynamicSizedGarage<Car> garage = new DynamicSizedGarage<>();
    garage.add(new Car("Toyota"));
    garage.add(new Car("Jaguar"));
    garage.add(new Car("BMW"));
    garage.forEach(car -> System.out.println(car.getName()));*/
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Hell yeah"));
        trucks.add(new Truck("Terminator"));

        DynamicSizedGarage<Car> garage = new DynamicSizedGarage<>();
        garage.add(new Car("Aston Martin"));
        // Error: incompatible types: List<Truck>
        //        cannot be converted to List<Car>
        garage.addAll(trucks);
    }
}
