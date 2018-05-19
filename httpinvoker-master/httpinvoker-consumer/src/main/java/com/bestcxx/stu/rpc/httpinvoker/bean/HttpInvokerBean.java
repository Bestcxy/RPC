package com.bestcxx.stu.rpc.httpinvoker.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import com.bestcxx.stu.rpc.httpinvoker.api.ApiService;


@Configuration
public class HttpInvokerBean {
	
	/**
	 * 为远程服务设置代理
	 * @return
	 */
	@Bean
	public HttpInvokerProxyFactoryBean apiService(){
		HttpInvokerProxyFactoryBean proxy=new HttpInvokerProxyFactoryBean();
		proxy.setServiceUrl("http://localhost:8086/httpinvoker-provider/api.service");
		proxy.setServiceInterface(ApiService.class);
		return proxy;
	}


}
