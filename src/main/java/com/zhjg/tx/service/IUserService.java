package com.zhjg.tx.service;

import com.zhjg.tx.pojo.User;

public interface IUserService {
	
	public void insert(User user);
	
	//最终调用的dao方法没有被aop代理
	public void insert1(User user);
	
	//通过注解生成事务代理
	public void insert2(User user);
}
