package com.bestcxx.stu.rpc.hessian.provider;

import com.bestcxx.stu.rpc.hessian.api.service.ApiService;
import com.bestcxx.stu.rpc.hessian.api.service.Model;

public class ApiServiceImpl implements ApiService {

	public String getName(String name) {
		String str="服务端：用户输入了姓名="+name;
		return str;
	}

	public Model getModel() {
		Model m=new Model();
		m.setAge(20);
		m.setUserName("jecket");
		return m;
	}

}
