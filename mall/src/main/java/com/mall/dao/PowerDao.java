package com.mall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mall.mapper.PowerMapper;
import com.mall.model.Powers;
import com.mall.util.DbUtil;

public class PowerDao {

	public List<Powers> getPowerById(int roleId) {
		SqlSession session = DbUtil.getSession();
		PowerMapper pm = session.getMapper(PowerMapper.class);
		List<Powers> powers = pm.getPowerById(roleId);
		session.close();
		return powers;
	}
	
	public List<Powers> listAll() {
		SqlSession session = DbUtil.getSession();
		PowerMapper pm = session.getMapper(PowerMapper.class);
		List<Powers> powers = pm.listAll();
		session.close();
		return powers;
	}
	
}
