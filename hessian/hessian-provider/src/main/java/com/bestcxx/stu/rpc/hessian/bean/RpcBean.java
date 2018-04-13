package com.bestcxx.stu.rpc.hessian.bean;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import com.bestcxx.stu.rpc.hessian.api.service.ApiService;
import com.bestcxx.stu.rpc.hessian.provider.ApiServiceImpl;


@Configuration
public class RpcBean {
	
	/**
	 * 设置URL映射
	 */
	@Bean
	public HandlerMapping hessianMapping(){
		SimpleUrlHandlerMapping shm=new SimpleUrlHandlerMapping();
		Properties properties=new Properties();
		properties.put("/api.service", "hessianExportedApiService");
		shm.setMappings(properties);
		return shm;
	}
	
	/**
	 * 注册为远程服务
	 * @return
	 */
	@Bean
	public HessianServiceExporter hessianExportedApiService(){
		HessianServiceExporter exporter=new HessianServiceExporter();
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
