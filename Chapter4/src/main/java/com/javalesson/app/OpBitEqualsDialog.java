package com.javalesson.app;

public class OpBitEqualsDialog extends AbstractClass{
    @Override
    public Calculator createCalculate() {
        return new OpBitEquals();
    }
}
