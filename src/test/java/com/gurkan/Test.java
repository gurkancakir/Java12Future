package com.gurkan;

import org.junit.Assert;
import org.junit.Before;

public class Test {

    public JavaFuture future;

    @Before
    public void init() {
        future = new JavaFuture();
    }


    @org.junit.Test
    public void test1() {
        int d1 = future.switchTest(1);
        int d2 = future.switchTest(4);
        int d3 = future.switchTest(6);

        Assert.assertEquals(d1, 6);
        Assert.assertEquals(d2, 9);
        Assert.assertEquals(d3, 6);
    }

    @org.junit.Test
    public void test2() {
        String s1 = future.switchTest2(1);
        String s2 = future.switchTest2(2);
        String s3 = future.switchTest2(3);

        Assert.assertEquals(s1, "test1");
        Assert.assertEquals(s2, "test2");
        Assert.assertEquals(s3, "test3");
    }
}
