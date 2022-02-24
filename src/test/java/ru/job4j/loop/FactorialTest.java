package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int factorial = 5;
        int result = Factorial.calc(factorial);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int factorial = 0;
        int result = Factorial.calc(factorial);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}