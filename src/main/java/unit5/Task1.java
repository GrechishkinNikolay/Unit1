package unit5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Задание 1. Работа с байтовыми потоками ввода-вывода
Прочитайте файл, содержащий код на языке Java. Определите, какие ключевые слова языка Java этот код содержит.
Выведите эти слова и их количество в другой файл. Используйте только байтовые потоки ввода-вывода.
*/
public class Task1 {

    public static void main(String[] args) {

        try (
            final DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/main/resources/someFileWithJavaCode.txt"));
            final DataOutputStream dataOutputStream = new DataOutputStream((new FileOutputStream("src/main/java/unit5/result.txt")));
        ) {

            String javaCode = new String(dataInputStream.readAllBytes());

            CounterJavaWords.countJavaWordsMap(javaCode)
                .forEach((key, value) -> {
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
