package tests;

import main.components.Rotor;
import main.components.RotorSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RotorSetTest {
    Rotor r1;
    Rotor r2;
    Rotor r3;
    RotorSet rs1;
    @BeforeEach
    void beforeTest() {
        r1 = new Rotor(1, "EKMFLGDQVZNTOWYHXUSPAIBRCJ");
        r2 = new Rotor(2, "AJDKSIRUXBLHWTMCQGZNPYFVOE");
        r3 = new Rotor(3, "BDFHJLCPRTXVZNYEIWGAKMUSQO");
        Rotor encryptReflect = new Rotor(4,"YRUHQSLDPXNGOKMIEBFZCWVJAT");
        rs1 = new RotorSet(r1, r2, r3, encryptReflect);
    }

    @Test
    void testSingleKeyCrypt() {
        char res = rs1.getFinalCrypt('A');

        assertEquals('B',res);
        assertEquals("JEKMFLGDQVZNTOWYHXUSPAIBRC",r1.getOutputConfig());

    }

}
