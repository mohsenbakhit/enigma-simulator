package main.components;

public class Rotor {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int count;
    char[] wiring;

    public Rotor(char startChar, char[] wiring) {
        this.count = startChar - 'A';
        this.wiring = wiring;
    }

    public char forwardEncrypt(char input) {
        int index = (ALPHABET.indexOf(input) + count) % 26;
        return wiring[index];
    }

    public char backwardEncrypt(char input) {
        int i;
        for (i = 0; i < wiring.length; i++) {
            if (wiring[i] == input) {
                break;
            }
        }
        return ALPHABET.charAt((i - count + 26) % 26);
    }

    public void incrementCount() {
        this.count = (this.count + 1) % 26;
    }

    public int getCount() {
        return this.count;
    }
}
