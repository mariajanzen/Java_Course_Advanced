package service;

import entity.Forecast;
import entity.SearchResult;

public class WeatherService {

    private WeatherGateway gateway;

    public WeatherService(WeatherGateway gateway) {
        this.gateway = gateway;
    }

    public String getWeatherByCityName(String cityName) throws Exception {
        SearchResult[] cityByName = gateway.findCityByName(cityName);
        if (cityByName.length == 0) {
            throw new RuntimeException("No results for " + cityName);
        }
        Forecast forecast = gateway.getWeatherByWoeid(cityByName[0].getWoeid());
        return forecast.getConsolidatedWeathers()[0].getTheTemp();
    }
}
