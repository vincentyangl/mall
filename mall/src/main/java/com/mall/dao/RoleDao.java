package com.mall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mall.mapper.RoleMapper;
import com.mall.model.Roles;
import com.mall.util.DbUtil;

public class RoleDao {

	public List<Roles> listAll() {
		SqlSession session = DbUtil.getSession();
		RoleMapper roleMapper = session.getMapper(RoleMapper.class);
		List<Roles> roles = roleMapper.listAll();
		session.close();
		return roles;
	}

	
	
	
	
}
