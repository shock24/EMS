package com.homeinsurance.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.homeinsurance.entities.AdminUser;
import com.homeinsurance.entities.NormalUser;

public class NormalDao {

	private SessionFactory factory;
	
	public NormalDao() {
		// TODO Auto-generated constructor stub
	}

	public NormalDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}

	public NormalUser getUserByEmailAndPassword(String email, String password)
	{
		NormalUser user = null;
		try{
			String query = "from NormalUser where email = :e and password= :p";
			Session session = this.factory.openSession();
			Query q = session.createQuery(query);
			q.setParameter("e", email);
			q.setParameter("p", password);
			user = (NormalUser)q.uniqueResult();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return user;
	}
}
