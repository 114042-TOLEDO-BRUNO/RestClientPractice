package ar.edu.utn.frc.tup.lciv.resttemplatepractice.Clients.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostRestClient {
    @Autowired
    private RestTemplate restTemplate;
    String baseURL="https://my-json-server.typicode.com/114042-TOLEDO-BRUNO/Mock-api/posts";

    public ResponseEntity<PostDTO[]> getPosts(){
       return restTemplate.getForEntity(baseURL,PostDTO[].class);//lo declaro como array apra que interpreta la conversion a list
    }

    public ResponseEntity<PostDTO> getPostById(Long id){
        return restTemplate.getForEntity(baseURL+"/"+id,PostDTO.class);
    }


}
