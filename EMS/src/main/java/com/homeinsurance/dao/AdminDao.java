package com.homeinsurance.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.homeinsurance.entities.AdminUser;
import com.homeinsurance.helper.FactoryProvider;

public class AdminDao {
	private SessionFactory factory;

	public AdminDao() {
		// TODO Auto-generated constructor stub
	}

	public AdminDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	public AdminUser getUserByEmailAndPassword(String email, String password)
	{
		AdminUser user = null;
		try{
			String query = "from AdminUser where adminEmail = :e and adminPassword= :p";
			Session session = this.factory.openSession();
			Query q = session.createQuery(query);
			q.setParameter("e", email);
			q.setParameter("p", password);
			user = (AdminUser)q.uniqueResult();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return user;
	}

}
