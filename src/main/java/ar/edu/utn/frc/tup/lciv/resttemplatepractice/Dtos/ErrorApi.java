package ar.edu.utn.frc.tup.lciv.resttemplatepractice.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorApi {//intereceptor
    private String timeStamp;
    private Integer status;
    private String error;
    private String message;
}
