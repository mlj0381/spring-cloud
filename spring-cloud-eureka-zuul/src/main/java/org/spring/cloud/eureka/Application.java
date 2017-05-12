package org.spring.cloud.eureka;

import org.spring.cloud.eureka.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

//@SpringCloudApplication == @SpringBootApplication @EnableDiscoveryClient @EnableCircuitBreaker
@SpringCloudApplication
@EnableZuulProxy
public class Application {
	
	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
