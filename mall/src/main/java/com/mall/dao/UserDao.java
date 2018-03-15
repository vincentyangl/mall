package com.mall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mall.mapper.UserMapper;
import com.mall.model.Users;
import com.mall.util.DbUtil;

public class UserDao {

	public Users checkUser(Users user) {
		SqlSession session = DbUtil.getSession();
		UserMapper um = session.getMapper(UserMapper.class);
		Users user1 = um.checkUser(user);
		session.close();
		return user1;
	}
	
	
	
	public List<Users> listAll() {
		SqlSession session = DbUtil.getSession();
		UserMapper um = session.getMapper(UserMapper.class);
	    List<Users> users = um.listAll();
	    session.close();
	    return users;
	}
	
}
