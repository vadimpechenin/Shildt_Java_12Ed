package com.javalesson.app;

public class MultByTwoDialog extends AbstractClass{
    @Override
    public Calculator createCalculate() {
        return new MultByTwo();
    }
}
