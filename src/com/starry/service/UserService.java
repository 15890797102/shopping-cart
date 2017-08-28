package com.starry.service;

import com.starry.dao.UserDao;
import com.starry.dao.UserDaoImp;
import com.starry.entity.User;

public class UserService {
	public boolean select(User user) {
		UserDao ud=new UserDaoImp();
		boolean bl=ud.userSelect(user);
		return bl;
	}
	
}
