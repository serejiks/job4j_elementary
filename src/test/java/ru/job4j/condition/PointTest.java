package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when31to20then1dot41() {
        double expected = 1.41;
        Point a = new Point(3, 1);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to24then3dot16() {
        double expected = 3.16;
        Point a = new Point(1, 1);
        Point b = new Point(2, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to27then7dot07() {
        double expected = 7.07;
        Point a = new Point(3, 0);
        Point b = new Point(2, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when721to879then9dot48() {
        double expected = 9.48;
        Point a = new Point(7, 2, 1);
        Point b = new Point(8, 7, 9);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when721to879then3dot31() {
        double expected = 3.31;
        Point a = new Point(4, 9, 1);
        Point b = new Point(3, 6, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}