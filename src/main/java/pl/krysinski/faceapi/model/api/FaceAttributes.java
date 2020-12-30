
package pl.krysinski.faceapi.model.api;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "smile",
    "gender",
    "age",
    "facialHair",
    "glasses",
    "emotion",
    "blur",
    "noise",
    "makeup",
    "hair"
})
public class FaceAttributes {

    @JsonProperty("smile")
    private Float smile;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("age")
    private Float age;
    @JsonProperty("facialHair")
    private FacialHair facialHair;
    @JsonProperty("glasses")
    private String glasses;
    @JsonProperty("emotion")
    private Emotion emotion;
    @JsonProperty("blur")
    private Blur blur;
    @JsonProperty("noise")
    private Noise noise;
    @JsonProperty("makeup")
    private Makeup makeup;
    @JsonProperty("hair")
    private Hair hair;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("smile")
    public Float getSmile() {
        return smile;
    }

    @JsonProperty("smile")
    public void setSmile(Float smile) {
        this.smile = smile;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("age")
    public Float getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Float age) {
        this.age = age;
    }

    @JsonProperty("facialHair")
    public FacialHair getFacialHair() {
        return facialHair;
    }

    @JsonProperty("facialHair")
    public void setFacialHair(FacialHair facialHair) {
        this.facialHair = facialHair;
    }

    @JsonProperty("glasses")
    public String getGlasses() {
        return glasses;
    }

    @JsonProperty("glasses")
    public void setGlasses(String glasses) {
        this.glasses = glasses;
    }

    @JsonProperty("emotion")
    public Emotion getEmotion() {
        return emotion;
    }

    @JsonProperty("emotion")
    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    @JsonProperty("blur")
    public Blur getBlur() {
        return blur;
    }

    @JsonProperty("blur")
    public void setBlur(Blur blur) {
        this.blur = blur;
    }

    @JsonProperty("noise")
    public Noise getNoise() {
        return noise;
    }

    @JsonProperty("noise")
    public void setNoise(Noise noise) {
        this.noise = noise;
    }

    @JsonProperty("makeup")
    public Makeup getMakeup() {
        return makeup;
    }

    @JsonProperty("makeup")
    public void setMakeup(Makeup makeup) {
        this.makeup = makeup;
    }

    @JsonProperty("hair")
    public Hair getHair() {
        return hair;
    }

    @JsonProperty("hair")
    public void setHair(Hair hair) {
        this.hair = hair;
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
        return "FaceAttributes{" +
                "smile=" + smile +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", facialHair=" + facialHair +
                ", glasses='" + glasses + '\'' +
                ", emotion=" + emotion +
                ", blur=" + blur +
                ", noise=" + noise +
                ", makeup=" + makeup +
                ", hair=" + hair +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
