package com.bestcxx.stu.rpc.httpinvoker.provider;

import com.bestcxx.stu.rpc.httpinvoker.api.ApiService;
import com.bestcxx.stu.rpc.httpinvoker.api.Model;

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
