package cn.tiger.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tiger.bo.UserBo;
import cn.tiger.dao.IUserDao;
import cn.tiger.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService{
	@Autowired(required=true)
	private IUserDao userDao;
	@Override
	public UserBo getUserById(String id) {
		
		return userDao.getUserById(id);
	}

}
