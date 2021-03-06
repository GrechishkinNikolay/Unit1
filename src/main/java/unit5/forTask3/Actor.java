package unit5.forTask3;

import java.io.Serializable;

public class Actor implements Serializable {
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
            "name='" + name + '\'' +
            '}';
    }
}
