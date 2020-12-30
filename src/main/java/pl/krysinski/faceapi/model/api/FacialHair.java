
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
    "moustache",
    "beard",
    "sideburns"
})
public class FacialHair {

    @JsonProperty("moustache")
    private Float moustache;
    @JsonProperty("beard")
    private Float beard;
    @JsonProperty("sideburns")
    private Float sideburns;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("moustache")
    public Float getMoustache() {
        return moustache;
    }

    @JsonProperty("moustache")
    public void setMoustache(Float moustache) {
        this.moustache = moustache;
    }

    @JsonProperty("beard")
    public Float getBeard() {
        return beard;
    }

    @JsonProperty("beard")
    public void setBeard(Float beard) {
        this.beard = beard;
    }

    @JsonProperty("sideburns")
    public Float getSideburns() {
        return sideburns;
    }

    @JsonProperty("sideburns")
    public void setSideburns(Float sideburns) {
        this.sideburns = sideburns;
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
        return "FacialHair{" +
                "moustache=" + moustache +
                ", beard=" + beard +
                ", sideburns=" + sideburns +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
