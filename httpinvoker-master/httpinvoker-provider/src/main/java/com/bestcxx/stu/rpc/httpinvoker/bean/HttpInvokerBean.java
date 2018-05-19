package com.bestcxx.stu.rpc.httpinvoker.bean;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import com.bestcxx.stu.rpc.httpinvoker.api.ApiService;
import com.bestcxx.stu.rpc.httpinvoker.provider.ApiServiceImpl;


@Configuration
public class HttpInvokerBean {
	

	/**
	 * 设置URL映射
	 */
	@Bean
	public HandlerMapping hessianMapping(){
		SimpleUrlHandlerMapping shm=new SimpleUrlHandlerMapping();
		Properties properties=new Properties();
		properties.put("/api.service", "httpInvokerExportedApiService");
		shm.setMappings(properties);
		return shm;
	}
	
	/**
	 * 将本地服务声明为远程服务
	 * @return
	 */
	@Bean
	public HttpInvokerServiceExporter httpInvokerExportedApiService(){
		HttpInvokerServiceExporter exporter=new HttpInvokerServiceExporter();
		exporter.setService(getApiService());
		exporter.setServiceInterface(ApiService.class);
		return exporter;
	}
	
	/**
	 * 注册为Spring Bean
	 * @return
	 */
	@Bean 
	public ApiService getApiService(){
		return new ApiServiceImpl();
	}

}
