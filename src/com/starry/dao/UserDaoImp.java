package com.starry.dao;

import org.apache.ibatis.session.SqlSession;

import com.starry.entity.User;
import com.starry.util.DateUtil;

public class UserDaoImp implements UserDao{

	@Override//��д��½�˺������жϷ���
	public boolean userSelect(User user) {
		SqlSession session= DateUtil.sqlSessionFactory.openSession();
		User user1= session.selectOne("user.selectUser", user);
		if(user1!=null) {
			System.out.println("��Ϊ��");
			return true;
		}
		return false;
	}
	
}
