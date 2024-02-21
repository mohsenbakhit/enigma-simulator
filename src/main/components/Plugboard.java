package main.components;

import java.util.HashMap;

public class Plugboard {
    HashMap<Character, Character> mapping;

    public Plugboard(HashMap<Character, Character> mapping) {
        this.mapping = mapping;
    }

    public void plug(char input, char output) {
        if (this.mapping.containsKey(input)) {
            char removable = mapping.get(input);
            this.mapping.remove(input);
            this.mapping.remove(removable);
        }
        this.mapping.put(input, output);
        this.mapping.put(output, input);
        System.out.println(mapping);
    }

    public char retrieve(char input) {
        if (!this.mapping.containsKey(input)) {
            return input;
        }
        return this.mapping.get(input);
    }
}
