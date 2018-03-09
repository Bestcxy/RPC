package com.bestcxx.stu.rpc.rmi.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		 ApplicationContext ctx = 
		 new ClassPathXmlApplicationContext("classpath:spring/applicationContext-bean.xml");  
		 System.out.println("服务端启动...");
	}
}
