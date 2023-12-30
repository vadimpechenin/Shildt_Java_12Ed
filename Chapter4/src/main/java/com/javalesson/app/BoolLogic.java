package com.javalesson.app;


/**
 * Класс для демонстрации работы логических операций над данными boolean.
 * @autor Герберт Шилдт
 * @version 1.0
 */
public class BoolLogic implements Calculator {
    private boolean result;
    @Override
    public void calculate() {
        boolean a = true; // 0 + 2 +1 или 0011 в двоичной форме
        boolean b = false; // 4 + 2 +0 или 0110 в двоичной форме
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println("              a = " + a);
        System.out.println("              b = " + b);
        System.out.println("            a|b = " + c);
        System.out.println("            a&b = " + d);
        System.out.println("            a^b = " + e);
        System.out.println("!a & b | a & !b = " + f);
        System.out.println("             !a = " + g);
        result = true;
    }

    public boolean isOk() {
        return result;
    }
}
