package test;

import main.components.Rotor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
public class RotorTest {
    private Rotor r1;
    private Rotor r2;
    private Rotor r3;

    @BeforeEach
    void BeforeTest() {
        r1 = new Rotor(1, "JGDQOXUSCAMIFRVTPNEWKBLZYH");
        r2 = new Rotor(2, "NTZPSFBOKMWRCJDIVLAEYUXHGQ");
        r3 = new Rotor(2, "JVIUBHTCDYAKEQZPOSGXNRMWFL");
    }

    @Test
    void testConstructor() {
        assertEquals(r1.getName(), 1);
        assertEquals(r1.getOutputConfig(),"JGDQOXUSCAMIFRVTPNEWKBLZYH");
    }

    @Test
    void testGetCrypt() {
        assertEquals(r1.getCrypt('A'),'J');
        assertEquals(r2.getCrypt('F'),'F');
    }

    @Test
    void testShiftConfig() {
        r1.shiftConfig();
        assertEquals(r1.getCrypt('A'),'H');
        assertEquals(r1.getCrypt('B'),'J');
    }

}
