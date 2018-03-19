import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class Main {
    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("ApiKey", "bahbS4of27rAhI8TuZc[@ERTWISR13NG5cto668dV4FZFivkkTuYdAI6hjbfgKViyHMGE6FTJZmIGBQyBrCI6IiDcKKSjkUhRkG0bDiOqrObpUj6OI18SlwxoC32Vj2[lkIiHkBIP8s4f@N0aTN3nFrOv3DpGhiyudgCoPYoG2Xs0iFGBv4h98Dxin39v6KLeYPdgA3xMotRUFCiv068O7OkOB3TqPe[rkYIrjjq65Vx6YYQDSpDvsBZFAXkkOZ1BUmy@[7WHRLXb9ml8XR4XHy8[gNWIYL2N9oK9VrxCVJ@dAtvT@6ZMZOn1@G50WdEesejtxGGwEWytyyCPpZZPcpOp2LPLpSvfZ2JvOCPn0X@ulSiAMTVLWlw2PQYK@MQHvLNS[CW@yOfVp7DLj5lQeJiv9gNijPfvf1fwj7JRaju0EHJVOSyti@mKWnfCEJvvGy7FmgfKfJNfXS[7uKYHAKFGPdr6vWfBo3y351G3KpKxLhS4t8p1521463650950");


        HttpEntity<String> httpEntity = new HttpEntity<String>(null, httpHeaders);

        ResponseEntity<String> userEntity =
                restTemplate.exchange("http://localhost:8080/user/oskar1", HttpMethod.GET, httpEntity, String.class);

        System.out.println(userEntity.getBody());
    }
}
