package tests;

import main.components.Reflector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReflectorTest {

    Reflector reflector;

    @BeforeEach
    void setTests() {
        reflector = new Reflector();
    }
    @Test
    void reflect() {
        assertEquals('Y',reflector.reflect('A'));
        assertEquals('A',reflector.reflect('Y'));
    }
}