package com.javalesson.app;

public abstract class AbstractClass {

    public boolean run(){
        Calculator calc = createCalculate();
        calc.calculate();
        return calc.isOk();
    }

    abstract public Calculator createCalculate();
}
