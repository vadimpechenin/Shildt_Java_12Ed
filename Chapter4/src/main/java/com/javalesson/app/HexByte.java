package com.javalesson.app;


/**
 * Класс для демонстрации работы побитового сдвига вправо.
 * Маскирование расширения знака
 * @autor Герберт Шилдт
 * @version 1.0
 */
public class HexByte implements Calculator {
    private boolean result;
    @Override
    public void calculate() {
        char[] hex =  {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }

    public boolean isOk() {
        return result;
    }
}
