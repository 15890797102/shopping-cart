package com.starry.dao;

import org.apache.ibatis.session.SqlSession;

import com.starry.entity.User;
import com.starry.util.DateUtil;

public class UserDaoImp implements UserDao{

	@Override//ÖØĞ´µÇÂ½ÕËºÅÃÜÂëÅĞ¶Ï·½·¨
	public boolean userSelect(User user) {
		SqlSession session= DateUtil.sqlSessionFactory.openSession();
		User user1= session.selectOne("user.selectUser", user);
		if(user1!=null) {
			System.out.println("²»Îª¿Õ");
			return true;
		}
		return false;
	}
	
}
