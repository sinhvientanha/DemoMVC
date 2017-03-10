package com.demo.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.mvc.dao.UsersDao;
import com.demo.mvc.model.Users;
import com.demo.mvc.service.UsersService;

@Service("UsersService")
@Transactional
public class UsersServiceImpl implements UsersService {

	@Autowired
    private UsersDao dao;
	
    public Users findUserById(int id) {
        return dao.findUserById(id);
    }
	
	public List<Users> getListUsers() {
		return dao.getListUsers();
	}

	public void addUser(Users users) {
		dao.addUser(users);
	}

	public void updateUsers(Users users) {
		Users user = dao.findUserById(users.getId());
        if(user != null){
        	user.setUsername(users.getUsername());
        	user.setFullname(users.getFullname());
        	user.setEmail(users.getEmail());
        }
	}

}
