package ExampleWildcards;

public class Garage<V extends Vehicle> {

    private V v;

    public V get() {
        return v;
    }

    public void set(V v) {
        this.v = v;
    }
}