package es.upm.miw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C52Test {

    private C52 c52 = new C52();

    @Test
    void testMA() {
        assertEquals("mA", c52.mA());
    }
}
