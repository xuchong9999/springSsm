package com.xuchong.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xuchong.dao.UserMapper;
import com.xuchong.pojo.User;

@Service("userService")
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(int userId) {
	    // TODO Auto-generated method stub
		User user = null;
		try {
			user = this.userMapper.selectByPrimaryKey(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return user;
	  }
}
