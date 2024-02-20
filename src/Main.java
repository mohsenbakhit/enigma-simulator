import main.components.RotorSet;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        char[] wiring1 = new char[]{'E','K','M','F','L','G','D','Q','V','Z','N','T','O','W',
                'Y','H','X','U','S','P','A','I','B','R','C','J'};
        char[] wiring2 = new char[]{'A','J','D','K','S','I','R','U','X','B','L','H','W','T',
                'M','C','Q','G','Z','N','P','Y','F','V','O','E'};
        char[] wiring3 = new char[]{'B','D','F','H','J','L','C','P','R','T','X','V','Z','N',
                'Y','E','I','W','G','A','K','M','U','S','Q','O'};

        RotorSet engine = new RotorSet('A','A','A',
                wiring1, wiring2, wiring3);
        char result = engine.encryptChar('D');
    }
}