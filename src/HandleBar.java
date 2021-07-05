import java.io.Serializable;

public class HandleBar implements Serializable {

    public int degree;

    public void right() {
        degree += 40;
        System.out.println("Руль вправо!");
    }

    public void left() {
        degree -= 40;
        System.out.println("Руль влево!");
    }

    @Override
    public String toString() {
        return "HandleBar{" +
            "degree=" + degree +
            '}';
    }

    @Override
    public HandleBar clone() throws CloneNotSupportedException {
        return (HandleBar) super.clone();
    }
}