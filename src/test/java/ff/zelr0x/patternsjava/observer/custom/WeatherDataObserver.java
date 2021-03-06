package ff.zelr0x.patternsjava.observer.custom;

public class WeatherDataObserver implements Observer {
    private double temperature;
    private double humidity;
    private double pressure;
    private final WeatherData wd;

    public WeatherDataObserver(final WeatherData wd) {
        this.wd = wd;
        update();
        wd.addObserver(this);
    }

    @Override
    public void update() {
        this.temperature = this.wd.getTemperature();
        this.humidity = this.wd.getHumidity();
        this.pressure= this.wd.getPressure();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
