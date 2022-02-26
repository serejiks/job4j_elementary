package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {23, 3, 55};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 23, 55};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf7elements() {
        int[] data = new int[] {99, 0, 32, 12, 2, 3, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 2, 3, 5, 12, 32, 99};
        Assert.assertArrayEquals(expected, result);
    }
}