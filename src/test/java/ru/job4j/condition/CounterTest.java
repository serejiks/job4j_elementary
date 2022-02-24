package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromSixToElevenThenThirty() {
        int start = 6;
        int finish = 11;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        Assert.assertEquals(expected, result);
    }
}