package com.zhjg.tx.service;

import com.zhjg.tx.pojo.User;

public interface IUserService {
	
	public void insert(User user);
	
	//���յ��õ�dao����û�б�aop����
	public void insert1(User user);
	
	//ͨ��ע�������������
	public void insert2(User user);
}
