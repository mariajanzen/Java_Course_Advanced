package entity;

import java.util.Arrays;

public class Forecast {
    private ConsolidatedWeather[] consolidatedWeathers;

    public Forecast() {

    }

    public Forecast(ConsolidatedWeather[] consolidatedWeathers) {
        this.consolidatedWeathers = consolidatedWeathers;
    }

    public ConsolidatedWeather[] getConsolidatedWeathers() {
        return consolidatedWeathers;
    }

    public void setConsolidatedWeathers(ConsolidatedWeather[] consolidatedWeathers) {
        this.consolidatedWeathers = consolidatedWeathers;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "consolidatedWeathers=" + Arrays.toString(consolidatedWeathers) +
                '}';
    }
}
