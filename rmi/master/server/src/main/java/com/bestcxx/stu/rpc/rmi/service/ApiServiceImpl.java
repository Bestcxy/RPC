package com.bestcxx.stu.rpc.rmi.service;

import com.bestcxx.stu.rpc.rmi.api.ApiService;
import com.bestcxx.stu.rpc.rmi.api.Model;

public class ApiServiceImpl implements ApiService{

	@Override
	public String getName(String name) {
		System.out.println("服务端被调用");
		return name;
	}

	@Override
	public Model getModel() {
		Model m=new Model();
		m.setUserName("jecket");
		m.setAge(20);
		return m;
	}

}
