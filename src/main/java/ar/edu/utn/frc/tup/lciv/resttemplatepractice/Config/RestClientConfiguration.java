package ar.edu.utn.frc.tup.lciv.resttemplatepractice.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientConfiguration {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}