public class Bicycle implements Cloneable {

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

    public class Seat {

        public void up() {

            System.out.println("Сиденье поднято выше!");
        }

        public void down() {

            System.out.println("Сиденье опущено ниже!");
        }
    }

    @Override
    public String toString() {
        return "Bicycle{" +
            "model='" + model + '\'' +
            ", weight=" + weight +
            ", handleBar.degree=" + handleBar.degree +
            '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}