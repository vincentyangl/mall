package com.mall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mall.mapper.PowerMapper;
import com.mall.mapper.UserMapper;
import com.mall.model.Powers;
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
	
	public List<Powers> getPowerById(int roleId) {
		SqlSession session = DbUtil.getSession();
		PowerMapper pm = session.getMapper(PowerMapper.class);
		List<Powers> powers = pm.getPowerById(roleId);
		session.close();
		return powers;
	}
}
