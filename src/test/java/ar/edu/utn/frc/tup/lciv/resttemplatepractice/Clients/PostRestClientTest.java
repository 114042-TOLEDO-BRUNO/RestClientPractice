package ar.edu.utn.frc.tup.lciv.resttemplatepractice.Clients;

import ar.edu.utn.frc.tup.lciv.resttemplatepractice.Clients.Post.PostDTO;
import ar.edu.utn.frc.tup.lciv.resttemplatepractice.Clients.Post.PostRestClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PostRestClientTest {

    @MockBean
    private RestTemplate restTemplate;
    @SpyBean//un mock que me permite utilizar los metodo tal cual estan definidos sin tener que mockearlos
    private PostRestClient postRestClient;

    @Test
    void getPostTest(){
        PostDTO postDTO1=new PostDTO(10L,"test unitario 1");
        PostDTO postDTO2=new PostDTO(11L,"test unitario 2");
        PostDTO[] arrayPosts={postDTO1,postDTO2};
        when(restTemplate.getForEntity("https://my-json-server.typicode.com/114042-TOLEDO-BRUNO/Mock-api/posts",PostDTO[].class))
                .thenReturn(ResponseEntity.ok(arrayPosts));
        ResponseEntity<PostDTO[]>result=postRestClient.getPosts();
        assertEquals(2, Objects.requireNonNull(result.getBody().length));
        assertEquals("test unitario 1",Objects.requireNonNull(result.getBody()[0].title()));
        assertEquals("test unitario 2",Objects.requireNonNull(result.getBody()[1].title()));

    }
    @Test
    void getPostById(){
        PostDTO postDTO=new PostDTO(1L,"test unitario");
        when(restTemplate.getForEntity("https://my-json-server.typicode.com/114042-TOLEDO-BRUNO/Mock-api/posts/1",PostDTO.class))
                .thenReturn(ResponseEntity.ok(postDTO));
        ResponseEntity<PostDTO> result=postRestClient.getPostById(1L);
        assertEquals(1,Objects.requireNonNull(result.getBody().id()));
    }

}
