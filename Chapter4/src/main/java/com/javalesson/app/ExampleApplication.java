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
        for (int index=0; index<7; index++){
            config = new Config(index);
            if (config.example == 0) {
                dialog = new IncDecDialog();
            } else if (config.example == 1) {
                dialog = new BitLogicDialog();
            }else if (config.example == 2) {
                dialog = new ByteShiftDialog();
            }else if (config.example == 3) {
                dialog = new MultByTwoDialog();
            }else if (config.example == 4) {
                dialog = new HexByteDialog();
            }else if (config.example == 5) {
                dialog = new ByteUShiftDialog();
            }else if (config.example == 6) {
                dialog = new OpBitEqualsDialog();
            }
            result = dialog.run();
        }
        return result;
    }
}
