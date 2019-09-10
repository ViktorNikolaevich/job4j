package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeitTest(){
        double in = 180;
        double expected = 92;
        double out=Fit.manWeight(in);
        Assert.assertEquals(expected, out,0);
    }

    @Test
    public void manWeitTest2(){
        double in = 181;
        double expected = 93.150;
        double out=Fit.manWeight(in);
        Assert.assertEquals(expected, out,0.001);
    }

    @Test
    public void womanWeitTest(){
        double in = 150;
        double expected = 46;
        double out=Fit.womanWeight(in);
        Assert.assertEquals(expected, out,0);
    }
}
