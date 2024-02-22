package main.components;

import java.util.HashMap;

public class Plugboard {
    HashMap<Character, Character> mapping;

    public Plugboard(HashMap<Character, Character> mapping) {
        this.mapping = mapping;
    }

    public void plug(char input, char output) {
        if (this.mapping.containsKey(input) || this.mapping.containsKey(mapping.get(input))) {
            char removable = mapping.get(input);
            this.mapping.remove(input);
            this.mapping.remove(removable);
        } else if (this.mapping.containsKey(output) || this.mapping.containsKey(mapping.get(output))) {
            char removable = mapping.get(output);
            this.mapping.remove(output);
            this.mapping.remove(removable);
        }
        this.mapping.put(input, output);
        this.mapping.put(output, input);
    }

    public char retrieve(char input) {
        if (!this.mapping.containsKey(input)) {
            return input;
        }
        return this.mapping.get(input);
    }
}
