package saint.cheshire.application;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static org.springframework.boot.SpringApplication.run;

@Log4j2
@SpringBootApplication(scanBasePackages = {"saint"})
@EnableJpaRepositories(basePackages = "saint")
@EntityScan("saint")
public class Application {

    public static void main(String[] args) {
        run(Application.class, args);
    }

}
