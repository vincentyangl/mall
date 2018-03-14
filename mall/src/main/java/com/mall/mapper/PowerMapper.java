package com.mall.mapper;

import java.util.List;
import java.util.Map;

import com.mall.model.Powers;

public interface PowerMapper {

	public void save(Powers power);
	
	public void delete(int pid);
	
	public void update(Powers power);
	
	public Powers getById(int pid);
	
	public List<Powers> listAll();
	
	public List<Powers> getPowerById(int roleId);
	
}
