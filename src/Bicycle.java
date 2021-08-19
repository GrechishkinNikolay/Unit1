import java.io.Serializable;

public class Bicycle implements Serializable {

    private String model;
    private int weight;
    public HandleBar handleBar;


    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
            "model='" + model + '\'' +
            ", weight=" + weight +
            ", handleBar.degree=" + handleBar.degree +
            '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}