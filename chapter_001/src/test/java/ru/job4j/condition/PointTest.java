package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceTest(){
        int x1=1, x2=0, y1=2, y2=0;
        double expected=2.236;
        double out=Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected,out,0.001);
    }

    @Test
    public void distanceTest2(){
        int x1=10, x2=0, y1=10, y2=0;
        double expected=14.142;
        double out=Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected,out,0.001);
    }
}
