package com.ribbon.ribbonserver.ctroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 负载均衡显示
 */
@RestController
public class RibConsHelloController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String hi(){
        return restTemplate.getForObject("http://hello/hi",String.class);
    }
}
