package org.spring.cloud.eureka.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;

/**
 * 网关过滤器
 */
public class AccessFilter extends ZuulFilter {
	
	private static final Logger logger = LoggerFactory.getLogger(AccessFilter.class);

	/**
	 * 过滤器的类型
	 * pre：可以在请求被路由之前调用
	 * routing：在路由请求时候被调用
	 * post：在routing和error过滤器之后被调用
	 * error：处理请求时发生错误时被调用
	 */
	@Override
	public String filterType() {
		return "pre";
	}

	/**
	 * 过滤器的执行顺序
	 */
	@Override
	public int filterOrder() {
		return 0;
	}
	
	/**
	 * 判断该过滤器是否要执行
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
        
        return null;
	}

}

