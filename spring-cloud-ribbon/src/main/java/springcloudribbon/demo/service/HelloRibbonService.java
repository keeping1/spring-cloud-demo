package springcloudribbon.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wkg on 2019/10/21
 */
@Service
public class HelloRibbonService {
    @Autowired
    public RestTemplate restTemplate;

        public String hiService(String name) {
            return restTemplate.getForObject("http://eureka-service//print?name=" + name, String.class);
        }

}
