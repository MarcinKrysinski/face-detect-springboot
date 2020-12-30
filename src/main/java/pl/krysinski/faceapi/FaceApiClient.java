package pl.krysinski.faceapi;

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

import java.util.stream.Stream;

@Controller
public class FaceApiClient {

    private static final String FACE_API_URL = "https://northeurope.api.cognitive.microsoft.com/face/v1.0/detect?returnFaceId=true&returnFaceLandmarks=false&returnFaceAttributes=age,gender,smile,facialHair,glasses,emotion,hair,makeup,blur,noise&recognitionModel=recognition_01&returnRecognitionModel=false&detectionModel=detection_01&faceIdTimeToLive=86400";


    @EventListener(ApplicationReadyEvent.class)
    public void get(){

        RestTemplate restTemplate = new RestTemplate();

        ImageUrl imageUrl = new ImageUrl("https://upload.wikimedia.org/wikipedia/en/f/f2/Robert_Downey_Jr._as_Tony_Stark_in_Avengers_Infinity_War.jpg");
        HttpHeaders httpHeaders =new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");
        httpHeaders.add("Ocp-Apim-Subscription-Key", "f37e330904e349e4bc07bc9f441f018a");

        HttpEntity<ImageUrl> imageUrlHttpEntity = new HttpEntity<>(imageUrl, httpHeaders);

        ResponseEntity<FaceObject[]> exchange = restTemplate.exchange(FACE_API_URL, HttpMethod.POST, imageUrlHttpEntity, FaceObject[].class);

        Stream.of(exchange.getBody()).forEach(System.out::println);
    }

}
