package main.components;

import java.io.IOException;

public class Rotor {
    int name;
    String outputConfig;
    public Rotor(int name, String outputConfig) {
        this.name = name;
        this.outputConfig = outputConfig;
    }

    public int getName() {
        return this.name;
    }

    public String getOutputConfig() {
        return this.outputConfig;
    }

    public char getCrypt(char input) {
        return this.outputConfig.charAt((int)input - 65);
    }

    public void shiftConfig() {
        String copyConfig = String.valueOf(outputConfig.charAt(25));
        for (int i = 0; i < this.outputConfig.length()-1; i++) {
            copyConfig += outputConfig.charAt(i);
        }
        this.outputConfig = copyConfig;
    }

}
