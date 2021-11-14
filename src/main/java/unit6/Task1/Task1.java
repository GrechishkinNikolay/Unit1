package unit6.Task1;

import javafx.application.Application;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Task1 {
    /*
    Создать "универсальный класс", позволяющий получить значение из любого properties-файла.
     Физическое чтение файла должно происходить только один раз. Результаты чтения хранить в коллекции типа Мар.
     */

    public static void main(String[] args) {

        try {
            createProperties();
            Map<String, String> props = loadProperties();

            System.out.println(props);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createProperties() throws Exception {
        Properties properties = new Properties();
        properties.setProperty("host", "smtp.mail.yahoo.com");
        properties.setProperty("port", "465");
        properties.setProperty("username", "testuser");
        properties.setProperty("password", "testpassword1");
        properties.setProperty("password", "testpassword3");
        properties.setProperty("password", "testpassword2");

        FileWriter writer = new FileWriter("some.properties");
        properties.store(writer, "some configuration");
        writer.close();
    }

    private static Map<String, String> loadProperties() throws Exception {
        Map<String, String> propertyMap = new HashMap();

        FileReader reader = new FileReader("some.properties");
        Properties properties = new Properties();
        properties.load(reader);

        Enumeration keys = properties.propertyNames();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            propertyMap.put(key, properties.getProperty(key));
        }

        reader.close();
        return propertyMap;
    }
}
