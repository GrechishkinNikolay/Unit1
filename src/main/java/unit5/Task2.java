package unit5;

import java.io.*;
import java.util.stream.Collectors;

/*
Задание 1. Работа с байтовыми потоками ввода-вывода
Прочитайте файл, содержащий код на языке Java. Определите, какие ключевые слова языка Java этот код содержит.
Выведите эти слова и их количество в другой файл.Используйте только символьные потоки ввода-вывода.
*/
public class Task2 {

    public static void main(String[] args) {

        try (
            final FileReader fileReader = new FileReader("src/main/resources/someFileWithJavaCode.txt");
            final FileWriter fileWriter = new FileWriter("src/main/java/unit5/result.txt");
        ) {

            String javaCode = new BufferedReader(fileReader).lines().collect(Collectors.joining());

            CounterJavaWords.countJavaWordsMap(javaCode)
                .forEach((key, value) -> {
                try {
                    fileWriter.append(key + " " + value + " " + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
