
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
    "anger",
    "contempt",
    "disgust",
    "fear",
    "happiness",
    "neutral",
    "sadness",
    "surprise"
})
public class Emotion {

    @JsonProperty("anger")
    private Float anger;
    @JsonProperty("contempt")
    private Float contempt;
    @JsonProperty("disgust")
    private Float disgust;
    @JsonProperty("fear")
    private Float fear;
    @JsonProperty("happiness")
    private Float happiness;
    @JsonProperty("neutral")
    private Float neutral;
    @JsonProperty("sadness")
    private Float sadness;
    @JsonProperty("surprise")
    private Float surprise;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("anger")
    public Float getAnger() {
        return anger;
    }

    @JsonProperty("anger")
    public void setAnger(Float anger) {
        this.anger = anger;
    }

    @JsonProperty("contempt")
    public Float getContempt() {
        return contempt;
    }

    @JsonProperty("contempt")
    public void setContempt(Float contempt) {
        this.contempt = contempt;
    }

    @JsonProperty("disgust")
    public Float getDisgust() {
        return disgust;
    }

    @JsonProperty("disgust")
    public void setDisgust(Float disgust) {
        this.disgust = disgust;
    }

    @JsonProperty("fear")
    public Float getFear() {
        return fear;
    }

    @JsonProperty("fear")
    public void setFear(Float fear) {
        this.fear = fear;
    }

    @JsonProperty("happiness")
    public Float getHappiness() {
        return happiness;
    }

    @JsonProperty("happiness")
    public void setHappiness(Float happiness) {
        this.happiness = happiness;
    }

    @JsonProperty("neutral")
    public Float getNeutral() {
        return neutral;
    }

    @JsonProperty("neutral")
    public void setNeutral(Float neutral) {
        this.neutral = neutral;
    }

    @JsonProperty("sadness")
    public Float getSadness() {
        return sadness;
    }

    @JsonProperty("sadness")
    public void setSadness(Float sadness) {
        this.sadness = sadness;
    }

    @JsonProperty("surprise")
    public Float getSurprise() {
        return surprise;
    }

    @JsonProperty("surprise")
    public void setSurprise(Float surprise) {
        this.surprise = surprise;
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
        return "Emotion{" +
                "anger=" + anger +
                ", contempt=" + contempt +
                ", disgust=" + disgust +
                ", fear=" + fear +
                ", happiness=" + happiness +
                ", neutral=" + neutral +
                ", sadness=" + sadness +
                ", surprise=" + surprise +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
