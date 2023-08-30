package ar.edu.utn.frc.tup.lciv.resttemplatepractice.Config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;



@Configuration
public class RestClientConfiguration {
    private static final int TIME_OUT=1000;//1 segundo
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        //return new RestTemplate();
        return builder//patron de diseño builder.
                .setConnectTimeout(Duration.ofMillis(TIME_OUT))//de conexion
                .setReadTimeout(Duration.ofMillis(TIME_OUT))//de lectura
                .build();
    }
}
