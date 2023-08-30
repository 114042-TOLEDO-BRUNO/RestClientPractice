package ar.edu.utn.frc.tup.lciv.resttemplatepractice.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PicoYPalaController {
    @GetMapping("/pico")
    public String picoYPala(){
        return "pala";
    }
}
