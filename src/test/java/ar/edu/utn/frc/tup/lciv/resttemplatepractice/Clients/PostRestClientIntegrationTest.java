package ar.edu.utn.frc.tup.lciv.resttemplatepractice.Clients;

import ar.edu.utn.frc.tup.lciv.resttemplatepractice.Clients.Post.PostDTO;
import ar.edu.utn.frc.tup.lciv.resttemplatepractice.Clients.Post.PostRestClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class PostRestClientIntegrationTest {//puede aparecer como PostRestClientITTest
    @Autowired
    private PostRestClient postRestClient;

    @Test
    void postsIntegrationTest(){
        ResponseEntity<PostDTO[]> result= postRestClient.getPosts();
        assertEquals(3, Objects.requireNonNull(result.getBody()).length);
    }

    @Test
    void postByIdIntegrationTest(){
        ResponseEntity<PostDTO> result= postRestClient.getPostById(1L);
        assertEquals("Good morning", Objects.requireNonNull(result.getBody().title()));
    }
}
