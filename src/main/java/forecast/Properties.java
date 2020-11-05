
package forecast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "updated",
    "units",
    "forecastGenerator",
    "generatedAt",
    "updateTime",
    "validTimes",
    "elevation",
    "periods"
})
public class Properties {

    @JsonProperty("updated")
    private String updated;
    @JsonProperty("units")
    private String units;
    @JsonProperty("forecastGenerator")
    private String forecastGenerator;
    @JsonProperty("generatedAt")
    private String generatedAt;
    @JsonProperty("updateTime")
    private String updateTime;
    @JsonProperty("validTimes")
    private String validTimes;
    @JsonProperty("elevation")
    private Elevation elevation;
    @JsonProperty("periods")
    private List<Period> periods = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("units")
    public String getUnits() {
        return units;
    }

    @JsonProperty("units")
    public void setUnits(String units) {
        this.units = units;
    }

    @JsonProperty("forecastGenerator")
    public String getForecastGenerator() {
        return forecastGenerator;
    }

    @JsonProperty("forecastGenerator")
    public void setForecastGenerator(String forecastGenerator) {
        this.forecastGenerator = forecastGenerator;
    }

    @JsonProperty("generatedAt")
    public String getGeneratedAt() {
        return generatedAt;
    }

    @JsonProperty("generatedAt")
    public void setGeneratedAt(String generatedAt) {
        this.generatedAt = generatedAt;
    }

    @JsonProperty("updateTime")
    public String getUpdateTime() {
        return updateTime;
    }

    @JsonProperty("updateTime")
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @JsonProperty("validTimes")
    public String getValidTimes() {
        return validTimes;
    }

    @JsonProperty("validTimes")
    public void setValidTimes(String validTimes) {
        this.validTimes = validTimes;
    }

    @JsonProperty("elevation")
    public Elevation getElevation() {
        return elevation;
    }

    @JsonProperty("elevation")
    public void setElevation(Elevation elevation) {
        this.elevation = elevation;
    }

    @JsonProperty("periods")
    public List<Period> getPeriods() {
        return periods;
    }

    @JsonProperty("periods")
    public void setPeriods(List<Period> periods) {
        this.periods = periods;
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
