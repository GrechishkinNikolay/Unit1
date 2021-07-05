package ExampleWildcards;

public class Garage<T extends Vehicle> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}