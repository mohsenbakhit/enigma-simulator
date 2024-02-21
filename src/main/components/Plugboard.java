package main.components;

import java.util.HashMap;

public class Plugboard {
    HashMap<Character, Character> mapping;

    public Plugboard(HashMap<Character, Character> mapping) {
        this.mapping = mapping;
    }

    public void plug(char input, char output) {
        if (this.mapping.containsKey(input)) {
            this.mapping.remove(input);
            this.mapping.remove(output);
        }
        this.mapping.put(input, output);
        this.mapping.put(output, input);
    }

    public char retrieve(char input) {
        return this.mapping.get(input);
    }
}
