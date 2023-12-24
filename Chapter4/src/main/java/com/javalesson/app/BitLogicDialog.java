package com.javalesson.app;

public class BitLogicDialog extends AbstractClass{
    @Override
    public Calculator createCalculate() {
        return new BitLogic();
    }
}
