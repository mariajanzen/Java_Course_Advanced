import service.InputOutputService;
import service.WeatherService;


public class WeatherForecastApp {

    private InputOutputService inputOutputService;
    private WeatherService weatherService;

    public WeatherForecastApp(InputOutputService inputOutputService, WeatherService weatherService) {
        this.inputOutputService = inputOutputService;
        this.weatherService = weatherService;
    }

    public void execute() throws Exception {
        String s = inputOutputService.readValue();
        String result = weatherService.getWeatherByCityName(s);
        inputOutputService.print(result);
    }

    public static void main(String[] args) {

    }
}
