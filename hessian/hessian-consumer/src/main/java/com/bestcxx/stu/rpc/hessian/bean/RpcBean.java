package com.bestcxx.stu.rpc.hessian.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.bestcxx.stu.rpc.hessian.api.service.ApiService;


@Configuration
public class RpcBean {
	
	/**
	 * 为远程服务设置代理
	 * @return
	 */
	@Bean
	public HessianProxyFactoryBean apiService(){
		HessianProxyFactoryBean proxy=new HessianProxyFactoryBean();
		proxy.setServiceUrl("http://localhost:8086/hessian-provider/api.service");
		proxy.setServiceInterface(ApiService.class);
		return proxy;
	}

}
