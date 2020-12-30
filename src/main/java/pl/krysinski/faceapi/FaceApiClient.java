package pl.krysinski.faceapi;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.krysinski.faceapi.model.ImageUrl;
import pl.krysinski.faceapi.model.api.FaceObject;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.stream.Stream;

@Controller
public class FaceApiClient {

    @Value("${Ocp-Apim-Subscription-Key}")
    private String ocpApimSubscriptionKey;
    private static final String FACE_BASE_API_URL = "https://northeurope.api.cognitive.microsoft.com/face/v1.0/detect?";

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<ImageUrl> imageUrlHttpEntity = getHttpEntity("https://upload.wikimedia.org/wikipedia/en/f/f2/Robert_Downey_Jr._as_Tony_Stark_in_Avengers_Infinity_War.jpg");
        ResponseEntity<FaceObject[]> exchange = restTemplate.exchange(getApiUrl(), HttpMethod.POST, imageUrlHttpEntity, FaceObject[].class);
        Stream.of(exchange.getBody()).forEach(System.out::println);
    }

    private HttpEntity<ImageUrl> getHttpEntity(String url) {
        ImageUrl imageUrl = new ImageUrl(url);
        HttpHeaders httpHeaders = getHttpHeaders();
        return new HttpEntity<>(imageUrl, httpHeaders);
    }

    private URI getApiUrl() {
        URI uri = null;
        try {
            URIBuilder uriBuilder = new URIBuilder(FACE_BASE_API_URL);
            uriBuilder.addParameter("returnFaceId", "true");
            uriBuilder.addParameter("returnFaceLandmarks", "false");
            uriBuilder.addParameter("returnFaceAttributes", "age,gender,smile,facialHair,glasses,emotion,hair,makeup,blur,noise");
            uriBuilder.addParameter("recognitionModel", "recognition_01");
            uriBuilder.addParameter("returnRecognitionModel", "false");
            uriBuilder.addParameter("detectionModel", "detection_01");
            uriBuilder.addParameter("faceIdTimeToLive", "86400");
            uri = uriBuilder.build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri;
    }

    private HttpHeaders getHttpHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");
        httpHeaders.add("Ocp-Apim-Subscription-Key", ocpApimSubscriptionKey);
        return httpHeaders;
    }

}
