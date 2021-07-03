
public class HandleBar implements Cloneable {

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
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}