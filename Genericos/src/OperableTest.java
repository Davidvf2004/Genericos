import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperableTest {

    @Test
    void testOperable() {
        Operable<Integer> operable = new Operable<Integer>() {
            private int value = 3;

            @Override
            public Integer sumar(Integer otro) {
                return value * 2 + otro;
            }

            @Override
            public Integer restar(Integer otro) {
                return value * 2 - otro;
            }

            @Override
            public Integer multiplicar(Integer otro) {
                return value * 2 * otro;
            }

            @Override
            public Integer dividir(Integer otro) {
                return value * 2 / otro;
            }
        };

        assertEquals(8, operable.sumar(2));
        assertEquals(4, operable.restar(2));
        assertEquals(12, operable.multiplicar(2));
        assertEquals(3, operable.dividir(2));
    }
}