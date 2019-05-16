package com.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.CategoryDao;
import com.model.Category;
import com.model.User;

@Repository("categoryDaoImpl")
public class CategoryDaoImpl  implements CategoryDao
{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public CategoryDaoImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void insertCategory(Category category)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(category);
		session.getTransaction().commit();
		
	}
	
	public List<Category> retreive()
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Category> list = session.createQuery("from Category").list();
		session.getTransaction().commit();
		return list;
		
	}
	
	public Category findById(int cid)
	{
		Session session = sessionFactory.openSession();
		Category c = null;
		try
		{
			session.beginTransaction();
			c= session.get(Category.class,cid);
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		
		return c;
	}
	
	
	
	
	

	
	
	

}










