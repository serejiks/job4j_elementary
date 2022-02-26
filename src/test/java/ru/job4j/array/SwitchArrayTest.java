package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to6() {
        int[] input = {1, 2, 3, 4, 19, 54, 5, 2};
        int source = 3;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 5, 19, 54, 4, 2};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to8() {
        int[] input = {5, 6, 32, 76, 2, 1, 65, 333, 23, 12};
        int source = 2;
        int dest = 8;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 6, 23, 76, 2, 1, 65, 333, 32, 12};
        Assert.assertArrayEquals(expected, result);
    }
}