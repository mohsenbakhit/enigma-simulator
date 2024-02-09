package main.components;


public class RotorSet {
    private int keysEntered = 0;
    private Rotor r1;
    private Rotor r2;
    private Rotor r3;
    public RotorSet(Rotor r1, Rotor r2, Rotor r3) {
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

     void keyClicked() {
        // Shifts Rotor 1 after each key
        this.r1.shiftConfig();
        this.keysEntered++;
        // Shifts Rotor 2 after a full rotation of R1
        if (this.keysEntered % 25 == 0) {
            this.r2.shiftConfig();
        }
        // Shift Rotor 3 after a full rotation of R2
        if (this.keysEntered % (25*25) == 0) {
            this.r3.shiftConfig();
            this.keysEntered = 0;
        }
    }

    public char getFinalCrypt(char input) {
        char result = this.r1.getCrypt(input);
        result = this.r2.getCrypt(result);
        result = this.r3.getCrypt(result);
        // Signal hits reflector
        result = this.r3.getCrypt(result);
        result = this.r2.getCrypt(result);
        result = this.r1.getCrypt(result);
        this.keyClicked();
        return result;
    }

}
