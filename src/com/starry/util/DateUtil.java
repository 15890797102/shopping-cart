package com.starry.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;



public class DateUtil {
	Logger loger=Logger.getLogger(DateUtil.class);
	public static final String my_path="mybatis-config.xml";
	public static InputStream is=null;
	public static SqlSessionFactory sqlSessionFactory;
	
	static{
		try {
			//使用mybatis提供的resource类加载mybatis的配置文件
			is=Resources.getResourceAsStream(my_path);
			//构建sqlSession的工厂
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
