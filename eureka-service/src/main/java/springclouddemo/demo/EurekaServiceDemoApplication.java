package springclouddemo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class EurekaServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceDemoApplication.class, args);
    }

}
