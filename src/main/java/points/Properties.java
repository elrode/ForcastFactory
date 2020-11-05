
package points;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@id",
    "@type",
    "cwa",
    "forecastOffice",
    "gridId",
    "gridX",
    "gridY",
    "forecast",
    "forecastHourly",
    "forecastGridData",
    "observationStations",
    "relativeLocation",
    "forecastZone",
    "county",
    "fireWeatherZone",
    "timeZone",
    "radarStation"
})
public class Properties {

    @JsonProperty("@id")
    private String id;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("cwa")
    private String cwa;
    @JsonProperty("forecastOffice")
    private String forecastOffice;
    @JsonProperty("gridId")
    private String gridId;
    @JsonProperty("gridX")
    private Integer gridX;
    @JsonProperty("gridY")
    private Integer gridY;
    @JsonProperty("forecast")
    private String forecast;
    @JsonProperty("forecastHourly")
    private String forecastHourly;
    @JsonProperty("forecastGridData")
    private String forecastGridData;
    @JsonProperty("observationStations")
    private String observationStations;
    @JsonProperty("relativeLocation")
    private RelativeLocation relativeLocation;
    @JsonProperty("forecastZone")
    private String forecastZone;
    @JsonProperty("county")
    private String county;
    @JsonProperty("fireWeatherZone")
    private String fireWeatherZone;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("radarStation")
    private String radarStation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@id")
    public String getId() {
        return id;
    }

    @JsonProperty("@id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("cwa")
    public String getCwa() {
        return cwa;
    }

    @JsonProperty("cwa")
    public void setCwa(String cwa) {
        this.cwa = cwa;
    }

    @JsonProperty("forecastOffice")
    public String getForecastOffice() {
        return forecastOffice;
    }

    @JsonProperty("forecastOffice")
    public void setForecastOffice(String forecastOffice) {
        this.forecastOffice = forecastOffice;
    }

    @JsonProperty("gridId")
    public String getGridId() {
        return gridId;
    }

    @JsonProperty("gridId")
    public void setGridId(String gridId) {
        this.gridId = gridId;
    }

    @JsonProperty("gridX")
    public Integer getGridX() {
        return gridX;
    }

    @JsonProperty("gridX")
    public void setGridX(Integer gridX) {
        this.gridX = gridX;
    }

    @JsonProperty("gridY")
    public Integer getGridY() {
        return gridY;
    }

    @JsonProperty("gridY")
    public void setGridY(Integer gridY) {
        this.gridY = gridY;
    }

    @JsonProperty("forecast")
    public String getForecast() {
        return forecast;
    }

    @JsonProperty("forecast")
    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    @JsonProperty("forecastHourly")
    public String getForecastHourly() {
        return forecastHourly;
    }

    @JsonProperty("forecastHourly")
    public void setForecastHourly(String forecastHourly) {
        this.forecastHourly = forecastHourly;
    }

    @JsonProperty("forecastGridData")
    public String getForecastGridData() {
        return forecastGridData;
    }

    @JsonProperty("forecastGridData")
    public void setForecastGridData(String forecastGridData) {
        this.forecastGridData = forecastGridData;
    }

    @JsonProperty("observationStations")
    public String getObservationStations() {
        return observationStations;
    }

    @JsonProperty("observationStations")
    public void setObservationStations(String observationStations) {
        this.observationStations = observationStations;
    }

    @JsonProperty("relativeLocation")
    public RelativeLocation getRelativeLocation() {
        return relativeLocation;
    }

    @JsonProperty("relativeLocation")
    public void setRelativeLocation(RelativeLocation relativeLocation) {
        this.relativeLocation = relativeLocation;
    }

    @JsonProperty("forecastZone")
    public String getForecastZone() {
        return forecastZone;
    }

    @JsonProperty("forecastZone")
    public void setForecastZone(String forecastZone) {
        this.forecastZone = forecastZone;
    }

    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("fireWeatherZone")
    public String getFireWeatherZone() {
        return fireWeatherZone;
    }

    @JsonProperty("fireWeatherZone")
    public void setFireWeatherZone(String fireWeatherZone) {
        this.fireWeatherZone = fireWeatherZone;
    }

    @JsonProperty("timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("radarStation")
    public String getRadarStation() {
        return radarStation;
    }

    @JsonProperty("radarStation")
    public void setRadarStation(String radarStation) {
        this.radarStation = radarStation;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
