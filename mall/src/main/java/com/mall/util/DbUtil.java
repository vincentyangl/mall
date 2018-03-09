package com.mall.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbUtil {

	private static SqlSessionFactory sf ;
	
	static{
		try{
		Reader reader = Resources.getResourceAsReader("mybatis.xml");
		sf = new SqlSessionFactoryBuilder().build(reader);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession() {
		SqlSession session =sf.openSession();
		return session;
	}
	
	public static void close(SqlSession session) {
		session.commit();
		session.close();
	}
	
}
