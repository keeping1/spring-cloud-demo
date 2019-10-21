package springclouddemo.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wkg on 2019/10/21
 */
@FeignClient("eureka-service")
public interface FeignHelloService {

    @RequestMapping("/print")
    String printport(@RequestParam("name") String name);
}
