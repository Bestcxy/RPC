package com.bestcxx.stu.rpc.rmi.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import com.bestcxx.stu.rpc.rmi.api.ApiService;

@Configuration
public class RpcBean {

	@Bean
	public RmiProxyFactoryBean apiService(){
		
		RmiProxyFactoryBean rmiProxy=new RmiProxyFactoryBean();
		
		//远程服务地址，直接指定了具体的host、ip、服务名称
		//rmiProxy.setServiceUrl("rmi://192.168.149.1:8080/ApiService");
		rmiProxy.setServiceUrl("rmi://127.0.0.1:1099/ApiService");
		
		//定义远程服务接口，服务端是该接口对应远程服务的实现
		rmiProxy.setServiceInterface(ApiService.class);
		
		//定义是否在首次配置远程服务后缓存该配置
		rmiProxy.setCacheStub(true);

		//如果远程调用缓存配置报错,设置为true，允许重新调用
		rmiProxy.setRefreshStubOnConnectFailure(false);
		
		//是否在客户端启动的时候检测服务端服务可用性-测试发现该属性没有发挥作用
		rmiProxy.setLookupStubOnStartup(false);
		return rmiProxy;
		
	}
	
}
