package springcloudribbon.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springcloudribbon.demo.service.HelloRibbonService;

/**
 * Created by wkg on 2019/10/21
 */
@RestController
@RequestMapping("/ribbon")
public class HelloRibbonController {
    @Autowired
    public HelloRibbonService service;

    @GetMapping("/print")
    public String print(@RequestParam String name) {
        return service.hiService(name);
    }
}
