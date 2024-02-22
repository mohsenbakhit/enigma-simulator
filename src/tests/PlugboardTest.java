package tests;

import main.components.Plugboard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PlugboardTest {

    Plugboard plugboard;

    @BeforeEach
    void setPlugboard() {
        plugboard = new Plugboard(new HashMap<>());
    }

    @Test
    void plugAndRetrieve() {
        plugboard.plug('A','B');
        assertEquals('B',plugboard.retrieve('A'));
        assertEquals('A',plugboard.retrieve('B'));
    }

    @Test
    void retrieveAlreadyPlugged() {
        plugboard.plug('A','B');
        plugboard.plug('C','A');
        assertEquals('C',plugboard.retrieve('A'));
        assertEquals('A',plugboard.retrieve('C'));
        assertEquals('B',plugboard.retrieve('B'));
    }
}