import main.components.EnigmaMachine;

public class Main {
    public static void main(String[] args) {

        EnigmaMachine engine = new EnigmaMachine('A','A','A');
        String plaintext = "ENTER YOUR TEXT";
        String ciphertext = engine.encrypt(plaintext.toUpperCase());
        System.out.println(ciphertext);
    }
}