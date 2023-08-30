package ar.edu.utn.frc.tup.lciv.resttemplatepractice.Clients.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProfileRestClient {
    @Autowired
    private RestTemplate restTemplate;
    String baseURL="https://my-json-server.typicode.com/114042-TOLEDO-BRUNO/Mock-api/profile";

    public ResponseEntity<Profile>getProfile(){
         return restTemplate.getForEntity(baseURL,Profile.class);
    }
}
