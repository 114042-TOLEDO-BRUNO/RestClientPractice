package ar.edu.utn.frc.tup.lciv.resttemplatepractice.Clients.Post;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PostDTO(Long id, String title) {//record es inmutable y
}
