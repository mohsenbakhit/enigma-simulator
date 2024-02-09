import main.components.Rotor;
import main.components.RotorSet;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Character> plugboard;
        Rotor r1 = new Rotor(1, "JGDQOXUSCAMIFRVTPNEWKBLZYH");
        Rotor r2 = new Rotor(2, "NTZPSFBOKMWRCJDIVLAEYUXHGQ");
        Rotor r3 = new Rotor(2, "JVIUBHTCDYAKEQZPOSGXNRMWFL");
        RotorSet enigma = new RotorSet(r1, r2, r3);


    }
}