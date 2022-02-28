package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] nested : array) {
            for (int num : nested) {
                rsl += num;
            }
        }
        return rsl;
    }
}
