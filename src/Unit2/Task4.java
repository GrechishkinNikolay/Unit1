package Unit2;

import Unit2.Stationeries.Marker;
import Unit2.Stationeries.Pen;
import Unit2.Stationeries.Pencil;
import Unit2.Stationeries.Stationery;
import java.util.ArrayList;
/*
    Задание 4. Сортировка
Используйте "набор новичка", созданные в задании 2 (или любую другую коллекцию объектов);
отсортируйте вещи в этом наборе по стоимости, по наименованию, по стоимости и наименованию.
*/

public class Task4 {

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
