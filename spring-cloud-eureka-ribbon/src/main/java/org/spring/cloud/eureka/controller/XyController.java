package org.spring.cloud.eureka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class XyController {

	private static final Logger logger = LoggerFactory.getLogger(XyController.class);

	@Autowired
    RestTemplate restTemplate;
	
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return restTemplate.getForEntity("http://EUREKA-SERVICE/add/"+a+"/"+b, Integer.class).getBody();
    }
}
