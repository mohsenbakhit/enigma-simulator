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
        plugboard = new Plugboard(new HashMap<Character, Character>());
    }

    @Test
    void plug() {
    }

    @Test
    void retrieve() {
    }
}