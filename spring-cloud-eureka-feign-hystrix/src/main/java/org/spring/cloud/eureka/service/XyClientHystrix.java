package org.spring.cloud.eureka.service;

import org.springframework.stereotype.Component;

@Component
public class XyClientHystrix implements XyService {

	@Override
	public Integer add(Integer a, Integer b) {
		System.out.println("a="+a+"  b="+b);
		//throw new RuntimeException();
		return 0;
	}

}
