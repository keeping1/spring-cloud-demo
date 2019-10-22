package springclouddemo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springclouddemo.demo.service.RibbonHystrixService;

/**
 * Created by wkg on 2019/10/22
 */
@RestController
@RequestMapping("/ribbon/hystrix")
public class RibbonHystrixController {

    @Autowired
    public RibbonHystrixService ribbonHystrixService;

    @GetMapping("/print")
    public String print(@RequestParam(name = "name") String name){
        return this.ribbonHystrixService.hiService(name);
    }

}
