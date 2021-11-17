package unit6.Task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Task1 {
    /*
    Создать "универсальный класс", позволяющий получить значение из любого properties-файла.
     Физическое чтение файла должно происходить только один раз. Результаты чтения хранить в коллекции типа Мар.
     */

    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        InputStream input = new FileInputStream("some.properties");
        prop.load(input);
        System.out.println(prop);

    }
}
