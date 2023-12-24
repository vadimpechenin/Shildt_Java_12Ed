package com.javalesson.app;

public class ExampleApplication {

    public AbstractClass dialog;

    public Config config;

    public static class Config{
        public int example;

        public Config(int ex){
            this.example = ex;
        }
    }

    public boolean showExample(){
        boolean result = false;
        for (int index=0; index<2; index++){
            config = new Config(index);
            if (config.example == 0) {
                dialog = new IncDecDialog();

            } else if (config.example == 1) {
                dialog = new BitLogicDialog();
            }
            result = dialog.run();
        }
        return result;
    }
}
