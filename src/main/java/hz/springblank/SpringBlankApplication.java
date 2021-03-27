package hz.springblank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringBlankApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBlankApplication.class, args);
        // Logger log = LoggerFactory.getLogger(SpringBlankApplication.class);
        // log.info("Hello world!");
    }

}
