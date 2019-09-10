package ru.job4j.converter;

/**
 * Created with IntelliJ IDEA.
 * User: operator
 * Date: 03.09.19
 * Time: 15:08
 * To change this template use File | Settings | File Templates.
 */
public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRub(int value){
        return  value * 70;
    }
    public static int dollarToRub(int value){
        return  value * 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int euro = rubleToEuro(140);
        int out =euro;
        boolean passed = expected == out;
        System.out.println("140 rubles are " + euro + " euro. Test result : " + passed);
        int dollar = rubleToDollar(180);
        out =euro;
        passed = expected == out;
        System.out.println("180 rubles are " + dollar +" dollar. Test result : " + passed);
        int rub1 = euroToRub(5);
        out =euro;
        passed = expected == out;
        System.out.println("5 euro are " + rub1 +" rubles. Test result : " + passed);
        int rub2 = dollarToRub(10);
        out =euro;
        passed = expected == out;
        System.out.println("10 dollar are " + rub2 +" rubles. Test result : " + passed);

        /*
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        */
    }
}
