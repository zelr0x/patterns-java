package ff.zelr0x.patternsjava.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonLazyWithDoubleCheckedLockingTest {

    @Test
    public void works() {
        assertEquals(SingletonLazyWithDoubleCheckedLocking.ORDINARY_FIELD_VALUE,
                SingletonLazyWithDoubleCheckedLocking.getInstance().getOrdinaryField());
    }
}