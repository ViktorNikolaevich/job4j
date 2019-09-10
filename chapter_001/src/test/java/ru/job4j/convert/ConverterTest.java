package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void euroToRub() {
        int in = 5;
        int expected = 350;
        int out = Converter.euroToRub(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollarToRub() {
        int in = 10;
        int expected = 600;
        int out = Converter.dollarToRub(in);
        Assert.assertEquals(expected, out);
    }
}