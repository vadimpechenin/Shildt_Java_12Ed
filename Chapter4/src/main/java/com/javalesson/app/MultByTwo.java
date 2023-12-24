package com.javalesson.app;


/**
 * Класс для демонстрации работы сдвига влево как способа умножения на 2.
 * @autor Герберт Шилдт
 * @version 1.0
 */
public class MultByTwo implements Calculator {
    private boolean result;
    @Override
    public void calculate() {
        int i;
        int num = 0xFFFFFFE;
        for (i=0; i<4; i++){
            num = num << 1;
            System.out.println(num);
        }
        result = true;
    }

    public boolean isOk() {
        return result;
    }
}
