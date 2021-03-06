package ff.zelr0x.patternsjava.observer.custom;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private double temperature;
    private double humidity;
    private double pressure;

    private final List<Observer> observers;

    public WeatherData(final double temperature, final double humidity,
                       final double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(final Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(final Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(final double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(final double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(final double pressure) {
        this.pressure = pressure;
    }
}
