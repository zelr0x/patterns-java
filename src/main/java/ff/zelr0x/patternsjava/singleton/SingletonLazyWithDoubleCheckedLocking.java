package ff.zelr0x.patternsjava.singleton;

/**
 * Lazily initialized.
 * Thread-safety is provided by double-checked locking.
 *
 * @since 1.5 - Before java 1.5, the volatile keyword could work incorrectly
 * with double-checked locking.
 */
public final class SingletonLazyWithDoubleCheckedLocking {
    public static final int ORDINARY_FIELD_VALUE = 5; // Only for testing

    private static volatile SingletonLazyWithDoubleCheckedLocking instance;
    private final int ordinaryField;

    public static SingletonLazyWithDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyWithDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SingletonLazyWithDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }

    public int getOrdinaryField() {
        return ordinaryField;
    }

    private SingletonLazyWithDoubleCheckedLocking() {
        ordinaryField = ORDINARY_FIELD_VALUE;
    }
}
