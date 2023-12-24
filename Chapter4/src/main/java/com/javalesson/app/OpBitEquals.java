package com.javalesson.app;


/**
 * Класс для демонстрации работы составных побитовых операций присваивания.
 * Маскирование расширения знака
 * @autor Герберт Шилдт
 * @version 1.0
 */
public class OpBitEquals implements Calculator {
    private boolean result;
    @Override
    public void calculate() {
        int a = 1;
        int b = 2;
        int c = 3;
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        result = true;
    }

    public boolean isOk() {
        return result;
    }
}
