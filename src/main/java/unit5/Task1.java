package unit5;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Задание 1. Работа с байтовыми потоками ввода-вывода
Прочитайте файл, содержащий код на языке Java. Определите, какие ключевые слова языка Java этот код содержит.
Выведите эти слова и их количество в другой файл. Используйте только байтовые потоки ввода-вывода.
*/
public class Task1 {

    private static List<String> javaKeyWords = new ArrayList<>(Arrays.asList("package", "public", "class", "private", "String", "this", "void", "static", "abstract", "import", "return"));

    public static void main(String[] args) {

        File file = new File("src/main/java/unit5/someFileWithJavaCode2.java");

        try (
                final DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/main/resources/someFileWithJavaCode.txt"));
                final DataOutputStream dataOutputStream = new DataOutputStream((new FileOutputStream("src/main/java/unit5/result.txt")));
        ) {

            String javaCode = new String(dataInputStream.readAllBytes());

            List<String> javaCodeWords = Arrays.asList(javaCode.split("[^a-zA-Z]+"));

            Map<String, Integer> map = new HashMap<>();

            javaCodeWords
                    .stream()
                    .filter(javaKeyWords::contains)
                    .forEach(keyWord -> {
                        if (map.containsKey(keyWord)) {
                            map.put(keyWord, map.get(keyWord) + 1);
                        } else {
                            map.put(keyWord, 1);
                        }
                    });

            map.forEach((key, value) -> {
                try {
                    dataOutputStream.writeBytes(key + " " + value + " " + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
