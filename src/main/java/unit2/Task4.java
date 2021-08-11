package unit2;

import unit2.Stationeries.Marker;
import unit2.Stationeries.OtherStationery;
import unit2.Stationeries.Pen;
import unit2.Stationeries.Pencil;
import unit2.Stationeries.Stationery;
import java.util.ArrayList;
import java.util.Comparator;
/*
    Задание 4. Сортировка
Используйте "набор новичка", созданные в задании 2 (или любую другую коллекцию объектов);
отсортируйте вещи в этом наборе по стоимости, по наименованию, по стоимости и наименованию.
*/

public class Task4 {

    public static void main(String[] args) {

        Pen stationery1 = new Pen(10, "Ручка");
        Pen stationery6 = new Pen(10, "Я");
        Pen stationery7 = new Pen(10, "А");
        Pencil stationery2 = new Pencil(27.90, "Карандаши");
        Marker stationery3 = new Marker(67, "Фломастеры");
        OtherStationery stationery4 = new OtherStationery(10, "Ластик");
        OtherStationery stationery5 = new OtherStationery(99, "Степлер");

        ArrayList<Stationery> standartSetOfStationeries = new ArrayList<>();
        standartSetOfStationeries.add(stationery1);
        standartSetOfStationeries.add(stationery2);
        standartSetOfStationeries.add(stationery3);
        standartSetOfStationeries.add(stationery4);
        standartSetOfStationeries.add(stationery5);
        standartSetOfStationeries.add(stationery6);
        standartSetOfStationeries.add(stationery7);

        System.out.println(standartSetOfStationeries);

        Comparator<Stationery> byPriceComparator = (Stationery s1, Stationery s2) -> Double.compare(s1.getPrice(), s2.getPrice());
        Comparator<Stationery> byNameComparator = (Stationery s1, Stationery s2) -> s1.getName().compareTo(s2.getName());

        standartSetOfStationeries.sort(byPriceComparator);
        System.out.println("По цене - " + standartSetOfStationeries);

        standartSetOfStationeries.sort(byNameComparator);
        System.out.println("По названию - " + standartSetOfStationeries);

        Comparator<Stationery> byPriceAndNameComparator = Comparator.comparingDouble(Stationery::getPrice)
            .thenComparing(Stationery::getName);

        standartSetOfStationeries.sort(byPriceAndNameComparator);
        System.out.println("По цене и названию - " + standartSetOfStationeries);

    }
}
