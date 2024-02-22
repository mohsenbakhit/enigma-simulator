import main.components.EnigmaMachine;

import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO THE ENIGMA SIMULATOR");
        System.out.println("Initialize your Rotor settings (e.g. AAA)");
        String rotorInput = scanner.nextLine();
        char[] rotorSettings = verifyRotorSettings(rotorInput);

        System.out.println("Initialize your plugboard. Enter letters in pairs divided by space i.e. AB CD");
        System.out.println("or hit enter to leave it empty.");
        String plugInput = scanner.nextLine();

        HashMap<Character, Character> plugboard = verifyPlugboard(plugInput);
        EnigmaMachine engine = new EnigmaMachine(rotorSettings[0], rotorSettings[1],rotorSettings[2], plugboard);
        String plaintext = "ENTER YOUR TEXT";
        String ciphertext = engine.encrypt(plaintext.toUpperCase());
        System.out.println(ciphertext);
    }

    public static char[] verifyRotorSettings(String rotorSettings) throws Exception {
        char[] rotors = new char[3];
        if (rotorSettings.length() > 3) {
           throw new Exception("Rotor settings are in form 'AAA'");
        }
        for (int i = 0; i < rotorSettings.length(); i++) {
            if (Character.isLetter(rotorSettings.charAt(i))) {
                rotors[i] = rotorSettings.charAt(i);
            }
        }
        return rotors;
    }

    public static HashMap<Character, Character> verifyPlugboard(String plugInput) throws Exception {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < plugInput.length()-1; i+=3) {
            if (Character.isLetter(plugInput.charAt(i))) {
                map.put(plugInput.charAt(i), plugInput.charAt(i+1));
            }
            else {
                throw new Exception("Enter letters in pairs divided by space i.e. AB CD");
            }
        }
        return map;
    }
}