package com.company.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.company.dao.ConnectionDao;

public class TestConnection {

	public static void main(String args[]){
		
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			
			System.out.println(System.getProperty("java.class.path"));
			
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession sqlSession=sqlSessionFactory.openSession();
			
			ConnectionDao connectionDao=sqlSession.getMapper(com.company.dao.ConnectionDao.class);
			List<Map<String,Object>> conn=connectionDao.conn();
			
			System.out.println(conn);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
