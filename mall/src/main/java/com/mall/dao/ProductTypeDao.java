package com.mall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mall.mapper.ProductTypeMapper;
import com.mall.model.ProductType;
import com.mall.util.DbUtil;


public class ProductTypeDao {

	public ProductType getById(int ptid) {
		SqlSession session = DbUtil.getSession();
		ProductTypeMapper ptm = session.getMapper(ProductTypeMapper.class);
		ProductType productType = ptm.getById(ptid);
		DbUtil.close(session);
		return productType;
	}
	
	public List<ProductType> listAll() {
		SqlSession session = DbUtil.getSession();
		ProductTypeMapper ptm = session.getMapper(ProductTypeMapper.class);
		List<ProductType> productTypes = ptm.listAll();
		DbUtil.close(session);
		return productTypes;
	}
	
	public void save(ProductType productType) {
		SqlSession session = DbUtil.getSession();
		ProductTypeMapper ptm = session.getMapper(ProductTypeMapper.class);
		ptm.save(productType);
		DbUtil.close(session);
	}
	
	public void delete(int ptid) {
		SqlSession session = DbUtil.getSession();
		ProductTypeMapper ptm = session.getMapper(ProductTypeMapper.class);
		ptm.delete(ptid);
		DbUtil.close(session);
	}
	
	public void update(ProductType productType) {
		SqlSession session = DbUtil.getSession();
		ProductTypeMapper ptm = session.getMapper(ProductTypeMapper.class);
		ptm.update(productType);
		DbUtil.close(session);
	}
}
