package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{32}, {12, 54}, {21, 56, 1}, {2, 8, 12, 4}};
        for (int[] array: numbers) {
            System.out.println(array.length);
        }
    }
}
