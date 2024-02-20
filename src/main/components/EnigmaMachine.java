package main.components;

public class EnigmaMachine {
    //As this is an M3 simulator, we have 3 Rotors and a Reflector
    Rotor r1;
    Rotor r2;
    Rotor r3;
    Reflector reflector;
    private int count;

    private final char[] wiring1 = new char[]{'E','K','M','F','L','G','D','Q','V','Z','N','T','O','W',
            'Y','H','X','U','S','P','A','I','B','R','C','J'};
    private final char[] wiring2 = new char[]{'A','J','D','K','S','I','R','U','X','B','L','H','W','T',
            'M','C','Q','G','Z','N','P','Y','F','V','O','E'};
    private final char[] wiring3 = new char[]{'B','D','F','H','J','L','C','P','R','T','X','V','Z','N',
            'Y','E','I','W','G','A','K','M','U','S','Q','O'};
    public EnigmaMachine(char startChar1, char startChar2, char startChar3) {
        this.r1 = new Rotor(startChar1, wiring1);
        this.r2 = new Rotor(startChar2, wiring2);
        this.r3 = new Rotor(startChar3, wiring3);
        this.reflector = new Reflector();
        this.count = 0;
    }

    public String encrypt(String plaintext) {
        StringBuilder cipher = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            cipher.append(encryptChar(plaintext.charAt(i)));
        }
        return cipher.toString();
    }

    char encryptChar(char input) {
        if (!Character.isLetter(input)) {
            return input;
        }
        rotateRotors();
        char output = this.r1.forwardEncrypt(input);
        output = this.r2.forwardEncrypt(output);
        output = this.r3.forwardEncrypt(output);
        output = this.reflector.reflect(output);
        output = this.r3.backwardEncrypt(output);
        output = this.r2.backwardEncrypt(output);
        output = this.r1.backwardEncrypt(output);
        return output;
    }

    public void rotateRotors() {
        this.count++;
        this.r1.incrementCount();
        if (this.count % 26 == 0) {
            this.r2.incrementCount();
        }
        if (this.count % (676) == 0) {
            this.r3.incrementCount();
        }
    }
}
