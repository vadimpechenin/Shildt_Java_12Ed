package com.javalesson.app;


/**
 * Класс для демонстрации работы побитового сдвига влево значения byte.
 * @autor Герберт Шилдт
 * @version 1.0
 */
public class ByteShift implements Calculator {
    private boolean result;
    @Override
    public void calculate() {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a<<2);
        System.out.println("Первоначальное значение а: " + a);
        System.out.println("i и b: " + i + " " + b);
        result = true;
    }

    public boolean isOk() {
        return result;
    }
}
