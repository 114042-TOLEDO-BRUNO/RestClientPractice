package ar.edu.utn.frc.tup.lciv.resttemplatepractice.Clients;
import ar.edu.utn.frc.tup.lciv.resttemplatepractice.Clients.Profile.Profile;
import ar.edu.utn.frc.tup.lciv.resttemplatepractice.Clients.Profile.ProfileRestClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProfileRestClientITTest {
    @Autowired
    private ProfileRestClient profileRestClient;

    @Test
    void getProfileTest(){
        ResponseEntity<Profile> result= profileRestClient.getProfile();
        assertEquals("typicode", Objects.requireNonNull(result.getBody().name()));
    }
}
