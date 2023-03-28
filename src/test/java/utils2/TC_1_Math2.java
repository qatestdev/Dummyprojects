package utils2;

import org.junit.Test;

import java.util.Optional;

import static junit.framework.TestCase.assertEquals;

public class TC_1_Math2 {

    @Test
    public void shouldSubtractIfMagicNumber() {
        Math2 m = new Math2();
        ;
        assertEquals(Optional.of(1), m.summary(5));
    }
}
