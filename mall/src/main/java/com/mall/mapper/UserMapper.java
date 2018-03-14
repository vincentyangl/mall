package com.mall.mapper;

import java.util.List;

import com.mall.model.Users;

public interface UserMapper {

	public void save(Users user);
	public void delete(int uid);
	public void update(Users user);
	public Users getById(int uid);
	public List<Users> listAll();
	public Users checkUser(Users user);
	
}
