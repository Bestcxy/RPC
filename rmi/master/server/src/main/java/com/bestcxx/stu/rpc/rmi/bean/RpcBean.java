package com.bestcxx.stu.rpc.rmi.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import com.bestcxx.stu.rpc.rmi.api.ApiService;
import com.bestcxx.stu.rpc.rmi.service.ApiServiceImpl;

@Configuration
public class RpcBean {

	/**
	 * 注册为远程服务
	 * @return
	 */
	@Bean
	public RmiServiceExporter rmiExporter(){
		RmiServiceExporter rmi=new RmiServiceExporter();
		rmi.setService(getApiService());
		rmi.setServiceName("ApiService");
		rmi.setServiceInterface(ApiService.class);
		rmi.setRegistryPort(8080);//注册 RMI 服务
		rmi.setServicePort(8082);//监听 RMI 服务，不指定就是0或者随机值
		return rmi;
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
