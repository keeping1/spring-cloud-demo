package springclouddemo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springclouddemo.demo.service.FeignHelloService;

/**
 * Created by wkg on 2019/10/21
 */
@RestController
@RequestMapping("/feign")
public class FeignHelloController {

    @Autowired
    private FeignHelloService service;

    @GetMapping("/print")
    public String print(@RequestParam("name") String name){

        return service.printport(name);
    }
}
