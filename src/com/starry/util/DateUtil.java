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
			//ʹ��mybatis�ṩ��resource�����mybatis�������ļ�
			is=Resources.getResourceAsStream(my_path);
			//����sqlSession�Ĺ���
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
