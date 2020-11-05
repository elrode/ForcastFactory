import forecast.Forecast;
import forecast.Period;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import points.Points;

import java.util.List;

public class WeatherForecast {
    private String gridID;
    private String gridX;
    private String gridY;
    private final String forecastURL;

    public WeatherForecast(double gpsX, double gpsY){
        String uri ="https://api.weather.gov/points/" + gpsX + "," + gpsY;
        RestTemplate restTemplate = new RestTemplate();
        Points points = null;
        try {
            points = restTemplate.getForObject(uri, Points.class);
        } catch (Exception e){
            System.out.println(e);
        }
        forecastURL = points.getProperties().getForecast();
    }

    public WeatherForecast(String gridID, String gridX, String gridY){
        this.gridID = gridID;
        this.gridX = gridX;
        this.gridY = gridY;
        forecastURL = "https://api.weather.gov/gridpoints/" + gridID + "/" + gridX + "," + gridY + "/forecast";
    }

    public List<Period> getTenDayForecast(){
        return getForecast(forecastURL);
    }

    public List<Period> getHourlyForeCast(){
        return getForecast(forecastURL + "/hourly");
    }

    @Bean
    private List<Period> getForecast(String uri){
        RestTemplate restTemplate = new RestTemplate();
        try {
            Forecast forecast = restTemplate.getForObject(uri, Forecast.class);
            return forecast.getProperties().getPeriods();
        } catch (Exception e){
            return null;
        }
    }
}
