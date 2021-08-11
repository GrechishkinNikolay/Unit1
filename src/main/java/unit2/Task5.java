package unit2;

/*
    Задание 5. Lambda-выражения
Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение.
Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true, если переданное число делится без остатка на 13.

Написать функциональный интерфейс с методом, который принимает три дробных числа a, b, c и возвращает тоже дробное число.
Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант (D = b^2 — 4ac).

Написать функциональный интерфейс с методом, который принимает 2 числа и возвращает их сумму.
При этом сделать так, чтобы можно было посчитать сумму чисел типа integer + integer, float + float, double + double.
Написать реализации такого интерфейса в виде лямбда-выражений для каждого типа возвращаемого значения.
*/

import unit2.forTask5.Remainder;
import unit2.forTask5.Adder;
import unit2.forTask5.Discriminant;

public class Task5 {

    public static void main(String[] args) {

        Remainder realisation = (int number) -> number % 13 == 0;
        System.out.println(realisation.isDivisibleBy13WithoutRemainder(26));

        Discriminant discriminant = (double a, double b, double c) -> b * b - 4 * a * c;
        System.out.println(discriminant.calculateDiscriminant(1.05, 2.6, 0.87));

        Adder<Integer> adderInt = (Integer a, Integer b) -> a + b;
        int a = 24;
        int b = 18;
        System.out.println(adderInt.add(a,b));

        Adder<Double> adderDouble = (Double ad,Double bd) -> ad + bd;
        double ad = 20;
        double bd = 22;
        System.out.println(adderDouble.add(ad,bd));

        Adder<Float> adderFloat = (Float af,Float bf) -> af + bf;
        float af = 19;
        float bf = 23;
        System.out.println(adderFloat.add(af,bf));
    }
}
