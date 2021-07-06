public class Runnre {

    public static void main(String args[]) throws CloneNotSupportedException {
        Bicycle peugeot = new Bicycle("Peugeot", 120);
        peugeot.handleBar = new HandleBar();

        Bicycle.Manual manual = new Bicycle.Manual();

        System.out.println(Bicycle.Manual.getManualText());

        peugeot.handleBar.left();

        Bicycle peugeot2 = (Bicycle) peugeot.clone();
        peugeot2.handleBar.right();

        System.out.println(peugeot);
        System.out.println(peugeot2);

//        seat.up();
//        peugeot.start();
//        handleBar.left();
//        System.out.println(peugeot);
//        handleBar.right();
//        handleBar.right();
//        System.out.println(peugeot);
    }
}
