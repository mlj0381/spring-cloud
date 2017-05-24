package org.spring.cloud.eureka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.cloud.eureka.service.XyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class XyController {

	private static final Logger logger = LoggerFactory.getLogger(XyController.class);

	@Autowired
    XyService xyService;
	
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
    	System.out.println("a+b="+(a+b));
        return xyService.add(a, b);
    }
}
