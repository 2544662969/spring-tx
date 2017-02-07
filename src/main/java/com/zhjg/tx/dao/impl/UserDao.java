package com.zhjg.tx.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zhjg.tx.dao.IUserDao;
import com.zhjg.tx.pojo.User;

@Component
public class UserDao implements IUserDao{

	/**
	 * addUser在spring配置文件中配置了事务代理
	 * charu没有配置事务代理
	 * 执行同样的代码charu会插入一条name为tom的用户记录
	 * addUser因为事务回滚没有任何记录
	 */
	
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public void addUser(User user) {
		System.out.println("addUser is invoking");
		template.execute("insert into t_user (name) values ('"+user.getName()+"')");
		template.execute("insert into t_user (name) values (mike)");
	}
	
	@Override
	public void charu(User user) {
		System.out.println("charu is invoking");
		template.execute("insert into t_user (name) values ('"+user.getName()+"')");
		template.execute("insert into t_user (name) values (mike)");
	}

	//@Transactional
	@Override
	public void xinjian(User user) {
		System.out.println("xinjian is invoking");
		template.execute("insert into t_user (name) values ('"+user.getName()+"')");
		template.execute("insert into t_user (name) values (mike)");
		
	}

}
