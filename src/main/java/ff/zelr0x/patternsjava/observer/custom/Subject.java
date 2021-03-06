package ff.zelr0x.patternsjava.observer.custom;

public interface Subject {
    void addObserver(final Observer observer);
    void removeObserver(final Observer observer);
    void notifyObservers();
}
