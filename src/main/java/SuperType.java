import java.util.Objects;

public class SuperType implements Cloneable {

    public int i;
    public int i2;

    public void classMethod(){
        System.out.println("Super type static method");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SuperType)) {
            return false;
        }
        SuperType superType = (SuperType) o;
        return i == superType.i && i2 == superType.i2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, i2);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
