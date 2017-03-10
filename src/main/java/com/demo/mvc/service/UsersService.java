package com.demo.mvc.service;

import java.util.List;

import com.demo.mvc.model.Users;

public interface UsersService {
	
	List<Users> getListUsers();
	void addUser(Users users);
	void updateUsers(Users users);
	Users findUserById(int id);

}
