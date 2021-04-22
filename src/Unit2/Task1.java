package Unit2;

import Unit2.Stationeries.OtherStationery;
import Unit2.Stationeries.Pen;
import Unit2.Stationeries.Pencil;
import Unit2.Stationeries.Stationery;
import java.util.ArrayList;
import java.util.Arrays;

/*
    Задание 1. Классы, объекты, перегрузка
Напишите приложение, позволяющее вести учет канцелярских товаров на рабочем месте сотрудника.
Определите стоимость канцтоваров у определенного сотрудника.
Поле стоимости сделать типом double. Перегрузить метод установки значения для поля стоимости,
чтобы была возможность передавать стоимость с типом integer и long.
В каждом классе определить методы equals(), hashCode(), toString().
*/
public class Task1 {

    public static void main(String[] args) {

        Stationery stationery1 = new OtherStationery(70, "Степлер");
        Stationery stationery2 = new OtherStationery(99.99, "Скотч");
        Stationery stationery3 = new OtherStationery(130, "Ножницы");
        Stationery stationery4 = new OtherStationery(100, "Клей");
        Stationery stationery5 = new OtherStationery(39.90, "Набор зажимов");
        Stationery stationery6 = new Pen(47.90, "Ручки");
        Stationery stationery7 = new Pencil(27.90, "Карандаши");

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
        employee1.setStationeries(new ArrayList<>(Arrays.asList(stationery6, stationery7)));

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.printf(" У работника с именем \"%s\" концелярии на %5.2f", employee1.getName(), employee1.getPriceOfAllStationeries());
    }
}
