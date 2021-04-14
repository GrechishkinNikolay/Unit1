package Unit2;

import java.util.ArrayList;

/*
    Задание 1. Классы, объекты, перегрузка
Напишите приложение, позволяющее вести учет канцелярских товаров на рабочем месте сотрудника.
Определите стоимость канцтоваров у определенного сотрудника.
Поле стоимости сделать типом double. Перегрузить метод установки значения для поля стоимости,
чтобы была возможность передавать стоимость с типом integer и long.
В каждом классе определить методы equals(), hashCode(), toString().
    Задание 2. Наследование
Разработайте иерархию канцелярских товаров (достаточно 3 предметов).
Создайте "набор новичка", используя созданную иерархию.
Сделать так, чтобы невозможно было создать объект базового класса.
    Задание 3. Интерфейсы
Разработать программу, которая предоставит возможность клиенту общаться в мессенджере.
Создать 3 мессенджера, у которых должны быть обязательно определены методы sendMessage() и readMessage().
У клиента может быть только 1 из 3 мессенджеров, но заранее неизвестно, какой именно.
    Задание 4. Сортировка
Используйте "набор новичка", созданные в задании 2 (или любую другую коллекцию объектов);
 отсортируйте вещи в этом наборе по стоимости, по наименованию, по стоимости и наименованию.
    Задание 5. Lambda-выражения
Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение. Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true, если переданное число делится без остатка на 13.
Написать функциональный интерфейс с методом, который принимает три дробных числа a, b, c и возвращает тоже дробное число. Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант (D = b^2 — 4ac).
Написать функциональный интерфейс с методом, который принимает 2 числа и возвращает их сумму. При этом сделать так, чтобы можно было посчитать сумму чисел типа integer + integer, float + float, double + double. Написать реализации такого
 интерфейса в виде лямбда-выражений для каждого типа возвращаемого значения.
*/
public class Task1 {

    public static void main(String[] args) {

        Stationery stationery1 = new Stationery(70, "Степлер");
        Stationery stationery2 = new Stationery(99.99, "Скотч");
        Stationery stationery3 = new Stationery(130, "Ножницы");
        Stationery stationery4 = new Stationery(100, "Клей");
        Stationery stationery5 = new Stationery(39.90, "Набор зажимов");

        ArrayList<Stationery> stationeries1 = new ArrayList<>();
        stationeries1.add(stationery1);
        stationeries1.add(stationery2);
        stationeries1.add(stationery3);
        stationeries1.add(stationery4);
        stationeries1.add(stationery5);

        ArrayList<Stationery> stationeries2 = new ArrayList<>();
        stationeries2.add(stationery2);
        stationeries2.add(stationery3);

        Employee employee1 = new Employee("Миша");
        Employee employee2 = new Employee("Саша", stationeries1);
        Employee employee3 = new Employee("Лена", stationeries2);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.printf(" У работника с именем \"%s\" концелярии на %5.2f", employee2.getName(), employee2.getPriceOfAllStationeries());
    }
}
