package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        /* формула перевода рублей в доллары. */
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + String.format("%.2f", euro) + " euro.");

        float dollar = Converter.rubleToDollar(35);
        System.out.println("35 rubles are " + String.format("%.2f", dollar) + " dollars.");
    }
}
