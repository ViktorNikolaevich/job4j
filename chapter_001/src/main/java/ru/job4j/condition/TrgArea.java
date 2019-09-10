package ru.job4j.condition;

/**
 * Created with IntelliJ IDEA.
 * User: operator
 * Date: 03.09.19
 * Time: 16:49
 * To change this template use File | Settings | File Templates.
 */
public class TrgArea {
    public static double area(double a, double b, double c) {
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
        double rsl2 = TrgArea.area(3, 4, 5);
        System.out.println("area (3, 4, 5) = " + rsl2);
    }
}