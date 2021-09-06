package unit5;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Задание 1. Работа с байтовыми потоками ввода-вывода
Прочитайте файл, содержащий код на языке Java. Определите, какие ключевые слова языка Java этот код содержит.
Выведите эти слова и их количество в другой файл. Используйте только байтовые потоки ввода-вывода.
*/
public class Task1 {

    private static List<String> javaKeyWords = new ArrayList<>(Arrays.asList("package", "public", "class", "private", "String", "this", "void", "static", "abstract", "import"));

    public static void main(String[] args) {

        try (
            final DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/main/java/unit5/someFileWithJavaCode.txt"));
        ) {

            String javaCode = new String(dataInputStream.readAllBytes());

            System.out.println("someFileWithJavaCode.txt содержит следующие ключевые слова: ");

            javaKeyWords.stream()
                .filter(javaCode::contains)
                .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
