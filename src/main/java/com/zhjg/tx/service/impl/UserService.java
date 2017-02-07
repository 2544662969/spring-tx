package com.zhjg.tx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhjg.tx.dao.IUserDao;
import com.zhjg.tx.pojo.User;
import com.zhjg.tx.service.IUserService;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private IUserDao userDao;

	@Override
	public void insert(User user) {
		userDao.addUser(user);
	}
	
	@Override
	public void insert1(User user) {
		userDao.charu(user);
	}

	@Override
	public void insert2(User user) {
		userDao.xinjian(user);
	}

}
