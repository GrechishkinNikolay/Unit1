package Unit2;

import Unit2.Stationeries.Marker;
import Unit2.Stationeries.Pen;
import Unit2.Stationeries.Pencil;
import Unit2.Stationeries.Stationery;
import java.util.ArrayList;
/*
    Задание 5. Lambda-выражения
Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение. Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true, если переданное число делится без остатка на 13.
Написать функциональный интерфейс с методом, который принимает три дробных числа a, b, c и возвращает тоже дробное число. Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант (D = b^2 — 4ac).
Написать функциональный интерфейс с методом, который принимает 2 числа и возвращает их сумму. При этом сделать так, чтобы можно было посчитать сумму чисел типа integer + integer, float + float, double + double. Написать реализации
такого
интерфейса в виде лямбда-выражений для каждого типа возвращаемого значения.
*/

public class Task5 {

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
