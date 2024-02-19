package main.components;

public class RotorSet {
    //As this is an M3 simulator, we have 3 Rotors and a Reflector
    Rotor r1;
    Rotor r2;
    Rotor r3;
    Reflector reflector;
    private int count;
    public RotorSet(char startChar1, char startChar2, char startChar3,
                    char[] wiring1, char[] wiring2, char[] wiring3) {
        this.r1 = new Rotor(startChar1, wiring1);
        this.r2 = new Rotor(startChar2, wiring2);
        this.r3 = new Rotor(startChar3, wiring3);
        this.reflector = new Reflector();
        this.count = 0;
    }

    public char encryptChar(char input) {
        rotateRotors();
        char output = this.r1.encrypt(input);
        output = this.r2.encrypt(output);
        output = this.r3.encrypt(output);
        output = this.reflector.reflect(output);
        output = this.r3.encrypt(output);
        output = this.r2.encrypt(output);
        output = this.r1.encrypt(output);
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
