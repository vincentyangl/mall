package com.mall.mapper;

import java.util.List;

import com.mall.model.Roles;

public interface RoleMapper {

	public void save(Roles role);
	public void delete(int roleId);
	public void update(Roles role);
	public Roles getById(int roleId);
	public List<Roles> listAll();
	public List<Roles> getRoleById(int pid);
	
}
