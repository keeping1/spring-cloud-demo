package springclouddemo.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wkg on 2019/10/21
 */
@RestController
public class eurekaController {

    @Value("${server.port}")
    private int serverPort;

    @RequestMapping("/print")
    public String serverPortPrint(@RequestParam(value = "name", defaultValue = "oscar") String name) {
        return "Hi " + name + " ,i am from port: " + serverPort;
    }
}
