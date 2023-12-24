package com.javalesson.app;


/**
 * Класс для демонстрации работы ++.
 * @autor Герберт Шилдт
 * @version 1.0
 */
public class IncDec implements Calculator {
    private boolean result;
    @Override
    public void calculate() {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        d = a++;
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        result = true;
    }

    public boolean isOk() {
        return result;
    }
}
