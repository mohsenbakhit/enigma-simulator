package main.components;

public class Rotor {
    int count;
    char[] wiring;

    public Rotor(char startChar, char[] wiring) {
        this.count = startChar - 'A';
        this.wiring = wiring;
    }

    public char encrypt(char input) {
        return wiring[input - 'A' + count];
    }

    public void incrementCount() {
        this.count = (this.count + 1) % 26;
    }
}
