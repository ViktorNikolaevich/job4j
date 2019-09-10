package ru.job4j.condition;

/**
 * Created with IntelliJ IDEA.
 * User: operator
 * Date: 03.09.19
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = distance(10, -5, 7, 3);
        System.out.println("result (10, -5) to (7, 3) " + result2);
        double result3 = distance(1, 4, 2, 8);
        System.out.println("result (1, 4) to (2, 8) " + result3);
    }
}
