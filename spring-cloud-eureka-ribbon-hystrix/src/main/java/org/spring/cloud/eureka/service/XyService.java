package org.spring.cloud.eureka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class XyService {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(groupKey = "UserGroup", fallbackMethod = "addFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")
    	})
	public Integer add(Integer a, Integer b) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return restTemplate.getForEntity("http://EUREKA-SERVICE/add?a=" + a + "&b=" + b, Integer.class).getBody();
	}

	public Integer addFallback(Integer a, Integer b, Throwable e) {
		System.out.println("a="+a+"  b="+b+"  e="+e.getMessage());
		throw new RuntimeException(e.getMessage());
	}
}
