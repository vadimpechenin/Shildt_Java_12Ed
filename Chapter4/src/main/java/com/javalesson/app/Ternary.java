package com.javalesson.app;


/**
 * Класс для демонстрации работы ?.
 * @autor Герберт Шилдт
 * @version 1.0
 */
public class Ternary implements Calculator {
    private boolean result;
    @Override
    public void calculate() {
        int i, k;

        for (i = 10; i>=-10; i-=20) {
            k = i < 0 ? -i : i; //получить абсолютную величину i
            System.out.print("Абсолютная величина ");
            System.out.println(i + " равна " + k);
        }
        result = true;
    }

    public boolean isOk() {
        return result;
    }
}
