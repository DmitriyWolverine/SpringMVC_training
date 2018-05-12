package by.htp.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import by.htp.springmvc.bean.users.User;


public class UserDaoHibernateImpl implements UserDao{

	@Override
	public void create(User entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public User read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		User artist = (User)session.get(User.class, id);
		session.close();
		return artist;
	}

	@Override
	public void update(User entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(User entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.delete(entity);
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		List<User> artists = criteria.list();
		session.close();
		return artists;
	}

}
