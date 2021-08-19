package unit5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Задание 2. Работа с символьными потоками ввода-вывода
Прочитайте файл, содержащий код на языке Java. Определите, какие ключевые слова языка Java этот код содержит.
Выведите эти слова и их количество в другой файл. Используйте только символьные потоки ввода-вывода.
*/
public class Task2 {

    public static void main(String[] args) {

        try (
            FileReader fileReader = new FileReader("someFileWithJavaCode.txt");
        ) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
