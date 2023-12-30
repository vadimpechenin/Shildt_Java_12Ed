package com.javalesson.app;

public class BoolLogicDialog extends AbstractClass{
    @Override
    public Calculator createCalculate() {
        return new BoolLogic();
    }
}
