package ru.job4j.calculator;

/**
 * Created with IntelliJ IDEA.
 * User: operator
 * Date: 03.09.19
 * Time: 15:30
 * To change this template use File | Settings | File Templates.
 */
public class Fit {

    public static double manWeight(double height) {
        return (height-100)*1.15;
    }


    public static double womanWeight(double height) {
        return (height-110)*1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(180);
        System.out.println("Man 180 is " + man);
        double woman = womanWeight(150);
        System.out.println("Woman 150 is " + woman);
    }

}
