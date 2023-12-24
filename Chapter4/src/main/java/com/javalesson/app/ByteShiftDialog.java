package com.javalesson.app;

public class ByteShiftDialog extends AbstractClass{
    @Override
    public Calculator createCalculate() {
        return new ByteShift();
    }
}
