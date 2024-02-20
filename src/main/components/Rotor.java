package main.components;

public class Rotor {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int count;
    char[] wiring;

    public Rotor(char startChar, char[] wiring) {
        this.count = startChar - 'A';
        this.wiring = wiring;
    }

    public char forwardEncrypt(char input) {
        int index = (ALPHABET.indexOf(input + count)) % 26;
        System.out.println(wiring[index]);
        return wiring[index];
    }

    public char backwardEncrypt(char input) {
        int i;
        for (i = 0; i < wiring.length; i++) {
            if (wiring[i] == input) {
                break;
            }
        }
        System.out.println(ALPHABET.charAt(i - count));
        return ALPHABET.charAt(i - count);
    }

    public void incrementCount() {
        this.count = (this.count + 1) % 26;
    }
}
