package com.zhjg.tx.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhjg.tx.pojo.User;
import com.zhjg.tx.service.IUserService;

public class TestSpringTx {
	
	private ApplicationContext context;
	
	@Before
	public void initContext(){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	
	@Test
	public void testInsertUser(){
		IUserService service = (IUserService) context.getBean("userService");
		service.insert(new User("tom"));
	}
	
	@Test
	public void testInsertUser1(){
		IUserService service = (IUserService) context.getBean("userService");
		service.insert1(new User("tom"));
	}
	
	@Test
	public void testInsertUser2(){
		IUserService service = (IUserService) context.getBean("userService");
		service.insert2(new User("tom"));
	}

}
