package org.spring.cloud.eureka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class XyService {

	@Autowired
    RestTemplate restTemplate;
	
    public Integer add(Integer a, Integer b) {
    	return restTemplate.getForEntity("http://EUREKA-SERVICE/add?a="+a+"&b="+b, Integer.class).getBody();
    }
}
