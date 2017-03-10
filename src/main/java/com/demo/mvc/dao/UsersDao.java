package com.demo.mvc.dao;

import java.util.List;

import com.demo.mvc.model.Users;

public interface UsersDao {
	
	List<Users> getListUsers();
	void addUser(Users users);
	Users findUserById(int id);

}
