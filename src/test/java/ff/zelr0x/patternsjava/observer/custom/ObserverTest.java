package ff.zelr0x.patternsjava.observer.custom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {
    private WeatherData wd;
    private static final double WD_TEMPERATURE_START = 0.0;
    private static final double WD_HUMIDITY_START = 5.0;
    private static final double WD_PRESSURE_START = 10.0;
    private static final double DELTA = 0.00001;

    @BeforeEach
    public void setWd() {
        wd = new WeatherData(WD_TEMPERATURE_START, WD_HUMIDITY_START, WD_PRESSURE_START);
    }

    @Test
    public void observer_works() {
        final var obs1 = new WeatherDataObserver(wd);
        final var obs2 = new WeatherDataObserver(wd);
        final var newTemp = -10.5;
        final var newHumidity = 20.0;
        final var newPressure = 15;

        wd.setTemperature(newTemp);
        wd.setHumidity(newHumidity);
        wd.setPressure(newPressure);

        assertFieldsInitialized(obs1);
        assertFieldsInitialized(obs2);

        wd.notifyObservers();

        assertEquals(newTemp, obs1.getTemperature(), DELTA);
        assertEquals(newHumidity, obs1.getHumidity(), DELTA);
        assertEquals(newPressure, obs1.getPressure(), DELTA);

        assertEquals(newTemp, obs2.getTemperature(), DELTA);
        assertEquals(newHumidity, obs2.getHumidity(), DELTA);
        assertEquals(newPressure, obs2.getPressure(), DELTA);
    }

    private void assertFieldsInitialized(WeatherDataObserver obs) {
        assertEquals(WD_TEMPERATURE_START, obs.getTemperature(), DELTA);
        assertEquals(WD_HUMIDITY_START, obs.getHumidity(), DELTA);
        assertEquals(WD_PRESSURE_START, obs.getPressure(), DELTA);
    }
}
