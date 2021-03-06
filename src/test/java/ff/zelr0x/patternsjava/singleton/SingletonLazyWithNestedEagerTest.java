package ff.zelr0x.patternsjava.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonLazyWithNestedEagerTest {

    @Test
    public void works() {
        assertEquals(SingletonLazyWithNestedEager.ORDINARY_FIELD_VALUE,
                SingletonLazyWithNestedEager.getInstance().getOrdinaryField());
    }
}