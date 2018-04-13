package com.bestcxx.stu.rpc.hessian.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bestcxx.stu.rpc.hessian.api.service.ApiService;
import com.bestcxx.stu.rpc.hessian.api.service.Model;


@RestController
public class HomeController {
	
	@Autowired
	private ApiService apiService;
	
	/**
	 * Controller 访问案例,根据id访问数据库
	 * @return
	 */
	@RequestMapping("/home")
	public Map<String,Object> home(){
		Map<String,Object> map=new HashMap<String,Object>();
		
		String name=apiService.getName("jecket");
		
		Model m=apiService.getModel();
		map.put("result", "success");
		map.put("name", name);
		map.put("model", m);
		
		return map;
		
	}
	
	
	
}
