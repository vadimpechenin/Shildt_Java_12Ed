package com.javalesson.app;

public class HexByteDialog extends AbstractClass{
    @Override
    public Calculator createCalculate() {
        return new HexByte();
    }
}
