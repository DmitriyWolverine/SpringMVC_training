package by.htp.springmvc.dao;

import java.util.List;

import by.htp.springmvc.bean.users.User;

public interface UserDao {
	void create(User entity);
	User read(int id);
	void update(User entity);
	void delete(User entity);
	List<User> readAll();

}
