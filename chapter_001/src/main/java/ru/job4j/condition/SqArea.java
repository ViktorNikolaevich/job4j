package ru.job4j.condition;

/**
 * Created with IntelliJ IDEA.
 * User: operator
 * Date: 03.09.19
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */
public class SqArea {
    public static double square(int p, int k) {
        double h = 0.5*p/(1+k);
        double L=h*k;
        return L*h;
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
