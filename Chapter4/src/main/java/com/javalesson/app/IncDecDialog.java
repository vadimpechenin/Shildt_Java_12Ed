package com.javalesson.app;

public class IncDecDialog extends AbstractClass{
    @Override
    public Calculator createCalculate() {
        return new IncDec();
    }
}
