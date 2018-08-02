package com.bestcxx.stu.rpc.hessian.consumer;

import java.net.MalformedURLException;

import org.junit.Test;

import com.bestcxx.stu.rpc.hessian.api.service.ApiService;
import com.caucho.hessian.client.HessianProxyFactory;
/**
 * 使用 HessianProxyFactory 直接测试远程接口的调用
 * @author Jecket
 *
 */
public class ApiServiceTest {
	
	@Test
	public void testGetName(){
		HessianProxyFactory hessianProxyFactory=new HessianProxyFactory();
		ApiService apiService;
		try {
			apiService=(ApiService) hessianProxyFactory.create(ApiService.class, "http://localhost:8086/hessian-provider/api.service");
			System.out.println(apiService.getName("Jecket"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
