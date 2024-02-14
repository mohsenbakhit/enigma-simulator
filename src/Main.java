import main.components.Rotor;
import main.components.RotorSet;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Character> plugboard;
        Rotor encryptR1 = new Rotor(1, "JGDQOXUSCAMIFRVTPNEWKBLZYH");
        Rotor encryptR2 = new Rotor(2, "NTZPSFBOKMWRCJDIVLAEYUXHGQ");
        Rotor encryptR3 = new Rotor(3, "JVIUBHTCDYAKEQZPOSGXNRMWFL");
        Rotor decryptR1 = new Rotor(4, "JGDQOXUSCAMIFRVTPNEWKBLZYH");
        Rotor decryptR2 = new Rotor(5, "NTZPSFBOKMWRCJDIVLAEYUXHGQ");
        Rotor decryptR3 = new Rotor(6, "JVIUBHTCDYAKEQZPOSGXNRMWFL");
        RotorSet encryptionMachine = new RotorSet(encryptR1, encryptR2, encryptR3);
        RotorSet decryptionMachine = new RotorSet(decryptR1, decryptR2, decryptR3);
        String plaintext = "AAA";
        String ciphertext = encrypt(plaintext, encryptionMachine);
        System.out.println(ciphertext);
        plaintext = encrypt(ciphertext, decryptionMachine);
        System.out.println(plaintext);


    }
    static String encrypt(String plain, RotorSet enigma) {
        String cipher = "";
        for (int i = 0; i < plain.length(); i++) {
            cipher += enigma.getFinalCrypt(plain.charAt(i));
        }
        return cipher;
    }
}