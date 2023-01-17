package labshopmonolith.common;


import labshopmonolith.InverntoryApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InverntoryApplication.class })
public class CucumberSpingConfiguration {
    
}
