package Unit2;

import Unit2.Stationeries.Marker;
import Unit2.Stationeries.Pen;
import Unit2.Stationeries.Pencil;
import Unit2.Stationeries.Stationery;
import Unit2.Stationeries.WritingTools;
import java.util.ArrayList;

/*
    Задание 2. Наследование
Разработайте иерархию канцелярских товаров (достаточно 3 предметов).
Создайте "набор новичка", используя созданную иерархию.
Сделать так, чтобы невозможно было создать объект базового класса.
*/
/*
    Задание 3. Интерфейсы
Разработать программу, которая предоставит возможность клиенту общаться в мессенджере.
Создать 3 мессенджера, у которых должны быть обязательно определены методы sendMessage() и readMessage().
У клиента может быть только 1 из 3 мессенджеров, но заранее неизвестно, какой именно.
*/
/*
    Задание 4. Сортировка
Используйте "набор новичка", созданные в задании 2 (или любую другую коллекцию объектов);
отсортируйте вещи в этом наборе по стоимости, по наименованию, по стоимости и наименованию.
*/
/*
    Задание 5. Lambda-выражения
Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение. Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true, если переданное число делится без остатка на 13.
Написать функциональный интерфейс с методом, который принимает три дробных числа a, b, c и возвращает тоже дробное число. Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант (D = b^2 — 4ac).
Написать функциональный интерфейс с методом, который принимает 2 числа и возвращает их сумму. При этом сделать так, чтобы можно было посчитать сумму чисел типа integer + integer, float + float, double + double. Написать реализации
такого
интерфейса в виде лямбда-выражений для каждого типа возвращаемого значения.
*/

public class Task2 {

    public static void main(String[] args) {

        Pen stationery1 = new Pen(47.90, "Ручки");
        Pencil stationery2 = new Pencil(27.90, "Карандаши");
        Marker stationery3 = new Marker(67, "Фломастеры");

//        WritingTools tool = new WritingTools(); //Не выйдет, т.к. абстрактный класс.

        ArrayList<Stationery> standartSetOfStationeries = new ArrayList<>();
        standartSetOfStationeries.add(stationery1);
        standartSetOfStationeries.add(stationery2);
        standartSetOfStationeries.add(stationery3);

        Employee лена = new Employee("Лена", standartSetOfStationeries);

        System.out.println(лена);
        System.out.printf(" У работника с именем \"%s\" концелярии на %5.2f", лена.getName(), лена.getPriceOfAllStationeries());
    }
}
