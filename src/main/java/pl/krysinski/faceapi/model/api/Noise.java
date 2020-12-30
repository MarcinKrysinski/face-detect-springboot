
package pl.krysinski.faceapi.model.api;

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
    "noiseLevel",
    "value"
})
public class Noise {

    @JsonProperty("noiseLevel")
    private String noiseLevel;
    @JsonProperty("value")
    private Float value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("noiseLevel")
    public String getNoiseLevel() {
        return noiseLevel;
    }

    @JsonProperty("noiseLevel")
    public void setNoiseLevel(String noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    @JsonProperty("value")
    public Float getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Float value) {
        this.value = value;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Noise{" +
                "noiseLevel='" + noiseLevel + '\'' +
                ", value=" + value +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
