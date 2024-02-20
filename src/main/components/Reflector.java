package main.components;

public class Reflector {
    char[] wiring;

    public Reflector() {
        this.wiring = new char[]{'Y', 'R', 'U', 'H', 'Q', 'S', 'L', 'D', 'P', 'X', 'N',
                'G', 'O', 'K', 'M', 'I', 'E', 'B', 'F', 'Z', 'C', 'W', 'V', 'J', 'A', 'T'};
    }

    public char reflect(char input) {
        System.out.println(wiring[input - 'A']);
        return wiring[input - 'A'];
    }
}
