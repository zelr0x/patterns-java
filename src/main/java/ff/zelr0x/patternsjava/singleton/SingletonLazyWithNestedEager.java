package ff.zelr0x.patternsjava.singleton;

/**
 * An instance is initialized eagerly in a Holder class,
 * but since it is nested, it is actually initialized lazily.
 * Thread-safety is provided by eager initialization.
 *
 * @since 1.2 - Before java 1.2, garbage collector could collect an instance
 * if the only reference to it was inside the Singleton class itself.
 */
public final class SingletonLazyWithNestedEager {
    public static final int ORDINARY_FIELD_VALUE = 42; // Only for testing

    private final int ordinaryField;

    public static SingletonLazyWithNestedEager getInstance() {
        return Holder.instance;
    }

    public int getOrdinaryField() {
        return ordinaryField;
    }

    private SingletonLazyWithNestedEager() {
        this.ordinaryField = ORDINARY_FIELD_VALUE;
    }

    private static final class Holder {
        private static final SingletonLazyWithNestedEager instance
                = new SingletonLazyWithNestedEager();

        private Holder() {
            throw new AssertionError();
        }
    }
}
