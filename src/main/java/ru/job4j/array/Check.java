package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean firstEl = data[0];
        for (boolean el : data) {
            if (firstEl != el) {
                result = false;
                break;
            }
        }
        return result;
    }
}
