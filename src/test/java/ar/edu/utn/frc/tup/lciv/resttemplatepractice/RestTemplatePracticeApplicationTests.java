package ar.edu.utn.frc.tup.lciv.resttemplatepractice;

import ar.edu.utn.frc.tup.lciv.resttemplatepractice.Controllers.PicoYPalaController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RestTemplatePracticeApplicationTests {
    @Autowired
    private PicoYPalaController controller;
    @Test
    void contextLoads()throws Exception {
        assertThat(controller).isNotNull();
    }

}
