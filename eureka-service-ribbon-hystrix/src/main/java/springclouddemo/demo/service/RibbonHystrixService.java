package springclouddemo.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wkg on 2019/10/22
 */
@Service
public class RibbonHystrixService {

    @Autowired
    public RestTemplate restTemplate;

   @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-service//print?name=" + name, String.class);
    }

    public String hiError(String name){
       return "Hi " + name + ", sorry, system error.";
    }
}
