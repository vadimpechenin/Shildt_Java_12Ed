package com.javalesson.app;

public class TernaryDialog extends AbstractClass{
    @Override
    public Calculator createCalculate() {
        return new Ternary();
    }
}
