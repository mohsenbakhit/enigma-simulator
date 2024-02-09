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
        r1 = new Rotor(1, "JGDQOXUSCAMIFRVTPNEWKBLZYH");
        r2 = new Rotor(2, "NTZPSFBOKMWRCJDIVLAEYUXHGQ");
        r3 = new Rotor(2, "JVIUBHTCDYAKEQZPOSGXNRMWFL");
        rs1 = new RotorSet(r1, r2, r3);
    }

    @Test
    void testSingleKeyCrypt() {
        char res = rs1.getFinalCrypt('A');
        assertEquals('W',res);
        assertEquals("HJGDQOXUSCAMIFRVTPNEWKBLZY",r1.getOutputConfig());

    }

}
