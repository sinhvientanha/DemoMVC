package com.demo.mvc.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.demo.mvc.dao.AbstractDao;
import com.demo.mvc.dao.UsersDao;
import com.demo.mvc.model.Users;

@Repository("UserDao")
public class UsersDaoImpl extends AbstractDao<Integer, Users> implements UsersDao {

	public List<Users> getListUsers() {
		Criteria criteria = createEntityCriteria();
        return (List<Users>) criteria.list();
	}

	public void addUser(Users users) {
		persist(users);
	}
	
    public Users findUserById(int id) {
        return getByKey(id);
    }

}
