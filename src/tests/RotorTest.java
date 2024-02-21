package tests;

import main.components.Rotor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotorTest {

    Rotor r1;

    @BeforeEach
    void setTests() {
        r1 = new Rotor('A',new char[]{'E','K','M','F','L','G','D','Q','V','Z','N','T','O','W',
                'Y','H','X','U','S','P','A','I','B','R','C','J'});
    }

    @Test
    void forwardEncryptTest() {
        char result = r1.forwardEncrypt('A');
        assertEquals('E',result);
    }

    @Test
    void backwardEncryptTest() {
        char result = r1.backwardEncrypt('A');
        assertEquals('U',result);
    }

    @Test
    void incrementCountTest() {
        assertEquals(0, r1.getCount());
        r1.incrementCount();
        assertEquals(1, r1.getCount());
        for (int i = 0; i < 26; i++) {
            r1.incrementCount();
        }
        assertEquals(1, r1.getCount());
    }
}