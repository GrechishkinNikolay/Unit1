import java.io.*;

public class Runnre {

    public static void main(String args[]) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Bicycle peugeot = new Bicycle("Peugeot", 120);
        peugeot.handleBar = new HandleBar();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream ous = new ObjectOutputStream(baos);
        ous.writeObject(peugeot);
        ous.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);

        Bicycle peugeot2 = (Bicycle)ois.readObject();
        peugeot2.setModel("Peugeot2222");

        System.out.println(peugeot);
        System.out.println(peugeot2);
        System.out.println();

        peugeot.handleBar.left();
        peugeot2.handleBar.right();

        System.out.println(peugeot);
        System.out.println(peugeot2);

    }
}
