package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void squareTest(){
        int p=6, k=2;
        double expected=2;
        double out=SqArea.square(p,k);
        Assert.assertEquals(expected,out,0.001);
    }

    @Test
    public void squareTest2(){
        int p=4, k=10;
        double expected=0.33;
        double out=SqArea.square(p,k);
        Assert.assertEquals(expected,out,0.001);
    }
}
