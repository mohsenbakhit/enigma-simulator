import main.components.Rotor;
import main.components.RotorSet;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Character> plugboard;
        Rotor encryptR1 = new Rotor(1, "EKMFLGDQVZNTOWYHXUSPAIBRCJ");
        Rotor encryptR2 = new Rotor(2, "AJDKSIRUXBLHWTMCQGZNPYFVOE");
        Rotor encryptR3 = new Rotor(3, "BDFHJLCPRTXVZNYEIWGAKMUSQO");
        Rotor encryptReflect = new Rotor(4,"YRUHQSLDPXNGOKMIEBFZCWVJAT");
        Rotor decryptR1 = new Rotor(5, "EKMFLGDQVZNTOWYHXUSPAIBRCJ");
        Rotor decryptR2 = new Rotor(6, "AJDKSIRUXBLHWTMCQGZNPYFVOE");
        Rotor decryptR3 = new Rotor(7, "BDFHJLCPRTXVZNYEIWGAKMUSQO");
        Rotor decryptRelect = new Rotor(8, "YRUHQSLDPXNGOKMIEBFZCWVJAT");
        RotorSet encryptionMachine = new RotorSet(encryptR1, encryptR2, encryptR3, encryptReflect);
        RotorSet decryptionMachine = new RotorSet(decryptR1, decryptR2, decryptR3, decryptRelect);
        String plaintext = "A";
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